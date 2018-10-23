// request handler?��?�� 직접 콘텐?�� 출력?���?
package ex02;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01 {
    
    @RequestMapping("/ex02/test01/m1")
    @ResponseBody
    public String m1() {
        // 리턴 값을 콘텐?���? 보낼 ?�� 메서?�� ?��?���??�� @ResponseBody�? 붙인?��.
        // 기본 콘텐?�� ???��?�� "text/plain;charset=ISO-8859-1" ?��?��.
        // 그래?�� ?���??�� 출력?�� ?�� ISO-8859-1 문자?��?�� ?���??�� ?��?��?���? ?��?��?�� 
        // ?�? 바�?�어 출력?��?��.
        return "Hello! ?��?��?��?��?��!";
    }
    
    @RequestMapping(value="/ex02/test01/m2", 
            produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2() {
        // ?���??�� 깨�?�? ?��?���? ?��?���? @RequestMapping?�� ?��보�?? ?��록하?��!
        //
        return "Hello! ?��?��?��?��?��!";
    }
    
    @RequestMapping("/ex02/test01/m3")
    public HttpEntity<String> m3() {
        // 
        // 리턴 ???��?�� HttpEntity?�� 경우 
        // ?��론트 컨트롤러?�� 리턴 값이 콘텐?��?�� 것으�? 간주?��?��.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        HttpEntity<String> entity = new HttpEntity<>(
                "Hello! ?��?��?��?��?��!",
                headers);
        
        return entity;
    }
    
    @RequestMapping("/ex02/test01/m4")
    public ResponseEntity<String> m4() {
        // 
        // 리턴 ???��?�� ReponseEntity?�� 경우 
        // ?��론트 컨트롤러?�� 리턴 값이 콘텐?��?�� 것으�? 간주?��?��.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>(
                "Hello! ?��?��?��?��?��!",
                headers,
                HttpStatus.OK);
        
        return entity;
    }
    
    
}









