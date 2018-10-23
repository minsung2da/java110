// request handler?? μ§μ  μ½ν?Έ μΆλ ₯?κΈ?
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
        // λ¦¬ν΄ κ°μ μ½ν?Έλ‘? λ³΄λΌ ? λ©μ? ? ?ΈλΆ?? @ResponseBodyλ₯? λΆμΈ?€.
        // κΈ°λ³Έ μ½ν?Έ ????΄ "text/plain;charset=ISO-8859-1" ?΄?€.
        // κ·Έλ? ?κΈ?? μΆλ ₯?  ? ISO-8859-1 λ¬Έμ?? ?κΈ??΄ ? ??μ§? ??? 
        // ?λ‘? λ°λ?μ΄ μΆλ ₯??€.
        return "Hello! ????Έ?!";
    }
    
    @RequestMapping(value="/ex02/test01/m2", 
            produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2() {
        // ?κΈ??΄ κΉ¨μ?μ§? ??λ‘? ?? €λ©? @RequestMapping? ? λ³΄λ?? ?±λ‘ν?Ό!
        //
        return "Hello! ????Έ?!";
    }
    
    @RequestMapping("/ex02/test01/m3")
    public HttpEntity<String> m3() {
        // 
        // λ¦¬ν΄ ????΄ HttpEntity?Ό κ²½μ° 
        // ?λ‘ νΈ μ»¨νΈλ‘€λ¬? λ¦¬ν΄ κ°μ΄ μ½ν?Έ?Έ κ²μΌλ‘? κ°μ£Ό??€.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        HttpEntity<String> entity = new HttpEntity<>(
                "Hello! ????Έ?!",
                headers);
        
        return entity;
    }
    
    @RequestMapping("/ex02/test01/m4")
    public ResponseEntity<String> m4() {
        // 
        // λ¦¬ν΄ ????΄ ReponseEntity?Ό κ²½μ° 
        // ?λ‘ νΈ μ»¨νΈλ‘€λ¬? λ¦¬ν΄ κ°μ΄ μ½ν?Έ?Έ κ²μΌλ‘? κ°μ£Ό??€.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>(
                "Hello! ????Έ?!",
                headers,
                HttpStatus.OK);
        
        return entity;
    }
    
    
}









