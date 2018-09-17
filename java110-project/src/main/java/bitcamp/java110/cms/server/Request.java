package bitcamp.java110.cms.server;

import java.util.HashMap;
import java.util.Map;

public class Request {

    String command;
    String queryString;
    String appPath;
    Map<String, String> paramMap = new HashMap<>();
    
    public Request(String command) {
        this.command = command;
        
        //명령에서 Query String 을 분리한다
        //ex) manager/detail?no=10
        String[] values = command.split("\\?");
        this.appPath = values[0]; // manager/detail 만 가져오는거고
        if(values.length >=2)
        {
            queryString  = values[1];//no=10을 가져옴
           
            parseQueryString(queryString);
        }
        
    }
    
    public void parseQueryString(String qs) {
        String [] values = qs.split("&");
        for(String value : values) {
           String[]kv = value.split("=");
           paramMap.put(kv[0], kv[1]);
        }
    }
    
    public String getParameter(String name) {
        return this.paramMap.get(name);
    }
    
    
    public String getAppPath(){
        return this.appPath;
    }
    
    public String getCommand() {
        return this.command;
    }
    
    
    public String getQueryString() {
        return this.queryString;
    }
    
    public static void main (String []  args) {
        
        String str = "manager/add?name=aaa&email=aaa@test.com&password=1111";
        
        Request req = new Request(str);
        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("password"));
        
   
        
    }
    
}
