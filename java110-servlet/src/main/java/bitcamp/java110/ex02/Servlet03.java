//서블릿 만들기2

// -javax.servlet.http.HttpServlet 상속받기

package bitcamp.java110.ex02;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ex02/servlet03")
public class Servlet03 extends HttpServlet{

   
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
       System.out.println("Servlet03.doGet() 호출됨");
        
    }


}


