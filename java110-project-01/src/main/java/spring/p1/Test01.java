package spring.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    
    public static void main(String[] args) {
        
        
      /* ApplicationContext iocContainer = 
               new AnnotationConfigApplicationContext(AppConfig.class);
        */
        
        
      ApplicationContext iocContainer = new 
                ClassPathXmlApplicationContext("spring/p1/app-context-1.xml");
        
   /*   Car c1 = (Car)iocContainer.getBean("c1");
        System.out.println(c1);*/
        
       CarFactory1 f = new CarFactory1();
        
       Car c1 = CarFactory1.create("그랜저");
      
      System.out.println(c1);
      
        
     Car c2 = (Car)iocContainer.getBean("c2");
      System.out.println(c2);
     
      
/*      Car c3 = (Car)iocContainer.getBean("c3");
      System.out.println(c3);*/
        
    }
    
    
}


