// request handler?—?„œ ì§ì ‘ ì½˜í…?Š¸ ì¶œë ¥?•˜ê¸?
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
        // ë¦¬í„´ ê°’ì„ ì½˜í…?Š¸ë¡? ë³´ë‚¼ ?•Œ ë©”ì„œ?“œ ?„ ?–¸ë¶??— @ResponseBodyë¥? ë¶™ì¸?‹¤.
        // ê¸°ë³¸ ì½˜í…?Š¸ ???…?´ "text/plain;charset=ISO-8859-1" ?´?‹¤.
        // ê·¸ë˜?„œ ?•œê¸??„ ì¶œë ¥?•  ?•Œ ISO-8859-1 ë¬¸ì?‘œ?— ?•œê¸??´ ? •?˜?˜ì§? ?•Š?•„?„œ 
        // ?ë¡? ë°”ë?Œì–´ ì¶œë ¥?œ?‹¤.
        return "Hello! ?•ˆ?…•?•˜?„¸?š”!";
    }
    
    @RequestMapping(value="/ex02/test01/m2", 
            produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2() {
        // ?•œê¸??´ ê¹¨ì?ì§? ?•Š?„ë¡? ?•˜? ¤ë©? @RequestMapping?— ? •ë³´ë?? ?“±ë¡í•˜?¼!
        //
        return "Hello! ?•ˆ?…•?•˜?„¸?š”!";
    }
    
    @RequestMapping("/ex02/test01/m3")
    public HttpEntity<String> m3() {
        // 
        // ë¦¬í„´ ???…?´ HttpEntity?¼ ê²½ìš° 
        // ?”„ë¡ íŠ¸ ì»¨íŠ¸ë¡¤ëŸ¬?Š” ë¦¬í„´ ê°’ì´ ì½˜í…?Š¸?¸ ê²ƒìœ¼ë¡? ê°„ì£¼?•œ?‹¤.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        HttpEntity<String> entity = new HttpEntity<>(
                "Hello! ?•ˆ?…•?•˜?„¸?š”!",
                headers);
        
        return entity;
    }
    
    @RequestMapping("/ex02/test01/m4")
    public ResponseEntity<String> m4() {
        // 
        // ë¦¬í„´ ???…?´ ReponseEntity?¼ ê²½ìš° 
        // ?”„ë¡ íŠ¸ ì»¨íŠ¸ë¡¤ëŸ¬?Š” ë¦¬í„´ ê°’ì´ ì½˜í…?Š¸?¸ ê²ƒìœ¼ë¡? ê°„ì£¼?•œ?‹¤.
        //
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>(
                "Hello! ?•ˆ?…•?•˜?„¸?š”!",
                headers,
                HttpStatus.OK);
        
        return entity;
    }
    
    
}









