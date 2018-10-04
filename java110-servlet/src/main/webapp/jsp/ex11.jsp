<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         trimDirectiveWhitespaces="true"
         isErrorPage ="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>JSP 빌트인 객체</h1>
<pre>
-JSP 페이지에서 사용할 수 있는 자바 객체이다.
-JSP 페이지로 서블릿 클래스를 만들 때 _jspService() 메서드 안에 생성되는 객체이다.
-빌트인 객체
 HttpServletRequest request - _jspService()의 파라미터
 HttpServletResponse response - _jspService()의 파라미터
 PageContext pageContext - _jspService()의 로컬변수
 HttpSession session - _jspService()의 로컬변수
 ServletContext application - _jspService()의 로컬변수
 ServletConfig config - _jspService()의 로컬변수
 JspWriter out - _jspService()의 로컬변수
 Object page - _jspService()의 로컬변수
  -현재 서블릿 객체를 가리킨다. 즉 this다
 Throwable exception - _jspService()의 로컬변수
  -JSP 페이지에 isErrorPage 속성값을 true로 설정하면 이 변수를 사용할 수 있다.
  
</pre>      

<%
//빌트인 객체 사용하기
request.setAttribute("name", "홍길동");
response.setHeader("aaa", "okok");
pageContext.setAttribute("age", 20);
session.setAttribute("tel", "1111-2");
application.setAttribute("gender", "woman");
String user = config.getInitParameter("user");
out.println("Hello!");
out.println("<br>");
out.println(page.getClass().getName());
out.println("<br>");
out.println(exception);
out.println("<br>");

//위 9개의 변수는 JSP 페이지에 존재하는 변수이기 때문에 컴파일 오류가 발생하지 않는다
//그러나 담음 ok와 같이 임의의 변수는 존재하지 않기 때문에 컴파일 오류가 발생한다
/* out.println(ok); */
%>


</body>
</html>
