//클라이언트가 보낸 데이터 읽기 - GET 요청으로 보낸 데이터



package bitcamp.java110.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/ex04/servlet01")
public class Servlet01 extends GenericServlet{

   
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, 
            ServletResponse res) throws ServletException, IOException {
      
        // GET 요청으로 값을 서버에 전달하는 방법
        // http://localhost:8888/ex04/servlet01?name=aaa&age=31&working=true
        
        // 테스트: http://localhost:8888/ex04/get.html 페이지에서 값 입력 후 보내기
        
        
      String name = req.getParameter("name");
      int age = Integer.parseInt(req.getParameter("age"));
      boolean working = Boolean.parseBoolean(req.getParameter("working"));
      
      res.setContentType("text/plain;charset=UTF8");
        
     PrintWriter out = res.getWriter();
     out.printf("name = %s\n", name);
     out.printf("age = %d\n", age);
     out.printf("working = %b\n", working);

     
    }

 
}


//GET요청
//GET요청으로 서버에 값을 보내기 위해서는  Request-URL에 포함해야 한다.

//GET /ex04/servlet01?name=%ED%99%8D%EA%B8%B8%EB%8F%99&age=3&working=ture HTTP/1.1


//Host: localhost:8888
//Connection: keep-alive
//Pragma: no-cache
//Cache-Control: no-cache
//Upgrade-Insecure-Requests: 1
//User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//Referer: http://localhost:8888/ex04/get.html
//Accept-Encoding: gzip, deflate, br
//Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
//Cookie: JSESSIONID=9101ECBEB5E471EE46BCFF3E20289458



//GET요청의 특징
//- URL에 데이터를 포함 시킨다.

//  => 즐겨찾기에 데이터를 포함하여 URL을 저장할 수 있다.
//  => 그래서 링크를 누르면 결과 화면을 바로 확인할 수 있다.
//  => (URL에 데이터가 포함되어 있기 때문에)
//  => 보통 조회 화면을 요청할 때 get 방식을 사용한다.

//- 보안
//  URL은 브라우저 캐시에 자동으로 보관되기 때문에 노출되지 말아야 할 데이터를 전송할 때는 적합하지 않다.
//  예를 들면 로그인, 회원가입, 글 등록/변경 등에는 적합하지 않다.

//- 대용량 데이터
// => 대부분의 웹서버는 request-uri 또는 헤더를 포함한 메타 데이터의 크기를
//   8kb 미만으로 설정하고 있다.
// => GET요청으로는 대용량의 데이터를 전송할 수 없다.

//- Binary 데이터 전송
// => request-URI 에 포함할 수 있는 것은 테스트 이기 때문에
//    바이너리 데이터(이미지,엑셀,영상 등)를 전송하는데 적합하지 않다.
// => base64인코딩을 이용하여 바이너리 데이터를 텍스트데이터로 변환한 다음에 보낼 순 있다.
//    하지만 결국 대용량의 데이터의 경우에는 마찬가지로 크기 제한 때문에 불가능하다.

//- 적용 부분
//  => 게시물 조회, 상품 조회 등 보내는 데이터가 노출되어도 상관 없는 경우

