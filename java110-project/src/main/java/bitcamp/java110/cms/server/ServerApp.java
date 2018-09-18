package bitcamp.java110.cms.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java110.cms.context.RequestMappingHandlerMapping;
import bitcamp.java110.cms.context.RequestMappingHandlerMapping.RequestMappingHandler;

//특정 url에 대해 톰캣서버가 이 서블릿을 찾을 수 있도록 등록한다.
//예) http://localhost:8888/java110-project/*
//                        /   애플리캐이션이름 / 서블릿 이름

@WebServlet("/app/*")
public class ServerApp implements javax.servlet.Servlet {
    
    ServletConfig config;
    ClassPathXmlApplicationContext iocContainer;
    RequestMappingHandlerMapping requestHandlerMap;
    
    
    private void createIoCContainer() {
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java110/cms/conf/application-context.xml");
    }
    
    private void processRequestMappingAnnotation() {
        requestHandlerMap = new RequestMappingHandlerMapping();
        String[] names = iocContainer.getBeanDefinitionNames();
        for (String name : names) {
            Object obj = iocContainer.getBean(name);
            requestHandlerMap.addMapping(obj);
        }
    }
    
    private void logBeansOfContainer() {
        System.out.println("------------------------");
        String[] nameList = iocContainer.getBeanDefinitionNames();
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("------------------------");
    }
    


    @Override
    public void init(ServletConfig config) throws ServletException {
        //서블릿 컨테이너는,
        //이 서블릿 객체를 생선한후 
        //이 서블릿이 실행하는데 필요한 자원을 작업을 준비할 수 있도록 
        //딱 한번 호출 한다.
       
        createIoCContainer();
        logBeansOfContainer();
        processRequestMappingAnnotation();
        
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        
        // 서블릿에서 작업을 하는 동안 서블릿 설정 정보를 참조할 필요가 있을 때, 이 메서드를 호출한다.
        // 따라서 이 메서드는 서블릿 설정 정보를 다루는 객체를 리턴해야 한다.
        //보통 init() 매서드가 호출 되어
        
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //서블릿 컨테이너는 클라이언트 요청이 들어올 때마다 호출한다. 
        // 이 메서드에서 요청을 처리할 컨트롤러의 메서드를 찾아 호출하면 된다.
  
       //예)http://localhost:8888/manager/list
       //HTTP 프로토콜 정보를 다루려면 request 객체를 원래의 타입으로 캐스팅한 후 사용하라 
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        
        String servletPath = httpRequest.getServletPath();
        String pathInfo = httpRequest.getPathInfo();
        
        System.out.println("sevletPath===>" + servletPath);
        System.out.println("pathInfo==>" + pathInfo);
        
        RequestMappingHandler mapping = 
                requestHandlerMap.getMapping(pathInfo.substring(1));
        
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if (mapping == null) {
            out.println("해당 요청을 처리할 수 없습니다.");
            return;
        }
        
        try {
            // 요청 핸들러 호출
            mapping.getMethod().invoke(mapping.getInstance(), request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
           out.println("요청 처리 중에 오류가 발생했습니다.");
        }
        

    }

    @Override
    public String getServletInfo() {
       //서블릿 컨테이너 관리자 화면에서 이 서블릿의 정보를 출력할 때 이 메서드를 호출한다.
        // 이 서블릿에 대한 간당한 정보를 문자열로 리턴하면 된다.
        
        return "클라이언트 요충을 중계하는 서블릿";
    }

    @Override
    public void destroy() {
        //서블릿 컨테이너는,
        //서버를 종료하거나 웹 애플리케이션을 정지하기 바로 직전에 이 메서드를 호출 한다
        //왜?
        //이 서블릿이 사용했던 자원을 해제시켜 메모리를 줄일 수 있도록 하기 위함이다.
        //연결된 소켓을 닫는 등의 작업을 이 메서드에서 수행하면 된다.
        
    }
    
} // ServletApp class













