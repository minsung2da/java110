//서블릿 만들기

//javax.servlet.Servlet 인터페이스 구현

package bitcamp.java110.ex02;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/ex02/servlet01")
public class Servlet01 implements Servlet{

    ServletConfig config;
    
    public Servlet01() {
        System.out.println("Servlet01() 호출됨");
        
    }
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
     
       System.out.println("init() 호출됨");
       this.config = config;
        
    }

    @Override
    public ServletConfig getServletConfig() {
       
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      
        System.out.println("service() 호출됨");
        
    }

    @Override
    public String getServletInfo() {
     
        return "Servlet01";
    }

    @Override
    public void destroy() {    
        
       System.out.println("destroy() 호출됨");
        
    }


}



// 서블릿 구동 절차
// - 클라이언트가 요청한 URL에 응답할 서블릿을 찾는다.
// - 해당 서블릿의 인스턴스가 이미 생성되었다면,
//    -service()를 호출한다.
// - 해당 서블릿의 인스턴스가 아직 생성되지 않았다면,
//    - 서블릿 객체 생성 및 생성자 호출
//    - init() 호출
//    - 그 다음 service() 호출
// - 만약 서블릿 컨테이너를 종료하거나 웹 애플리케이션의 실행을 멈춘다면,
//    - 생성된 모든 서블릿들에 대해 destroy()를 호출한다.
//    - 생성된 모든 서블릿 객체를 가비지로 만든다.
