package bitcamp.java110.cms.control;

import java.util.Scanner;

public class HelloController implements Controller {

    public String name = "4";
    
    @Override
    public void service(Scanner keyIn) {
       System.out.print("a? ");
       
       int a = Integer.parseInt(keyIn.nextLine());
       
       System.out.print("b? ");
       
       int b = Integer.parseInt(keyIn.nextLine());
       
       System.out.println(a+"+"+b+"="+(a+b));
       
       
        
    }
    
    

}
