/* HttpSession 보관소 생성 및 데이터 저장
 * 
 */
package bitcamp.java110.ex07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value ="/ex07/servlet03")
public class Servlet03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    
    @Override
    public void service(
            HttpServletRequest req, 
            HttpServletResponse res) 
            throws ServletException, IOException {

        
        
         //HttpSession 보관소 준비하기
        HttpSession session = req.getSession();
        
        //HttpSession 보관소에 값 저장하기
        session.setAttribute("ccc", req.getParameter("name"));
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();

        out.println("/ex07/servlet03 실행!");
        out.println("HttpSession에 값 보관!");
   
        
      
        
}

}


























