//객체생성 : Spring IoC 컨테이너 사용2
package ex01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {

    public static void main(String[] args) {
        
      
        //객체 생성과 소멸과 의존객체 주입을 관리하는 
        //bean container(=IoC 컨테이너) 생성하기
        
        ClassPathXmlApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ex01/app-context3.xml");
        
        //IoC container에서 객체 꺼내기
        
       Car obj = (Car)iocContainer.getBean("c1");
        
        System.out.println(obj);
                                  
        iocContainer.close();
     
       
    }
    
}
