package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
        
        
        Car c1 = new Car();
        c1.setModel("소나타");
        c1.setCc(1000);
        
        System.out.println(c1);
        
        System.out.println("------------------------------");
        
     /*   Car c2 = CarFactory01.create("소나타");
        
        System.out.println(c2);*/
        
        
        System.out.println("------------------------------");
        
        CarFactory01 f = new CarFactory01();
        
        Car c3 = f.create("그랜저");
        
        System.out.println(c3);
        
        System.out.println("------------------------------");
        
        ClassPathXmlApplicationContext iocContainer =
                   new ClassPathXmlApplicationContext("spring/app-context.xml");
        
        Car c4 = (Car)iocContainer.getBean("");
        
        System.out.println(c4);
        
        
        
        
    }
    
    
}
