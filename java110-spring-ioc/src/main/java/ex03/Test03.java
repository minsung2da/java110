// 객체 생성 : 컨테이너에서 객체 꺼내기
// 1) 객체의 아이디를 지정하기
//   - 오직 한개의 아이디만 지정할 수 있다.
//   - 문법
//      <bean id="객체명" class="클래스명" / >
// 2) 객체의 별명 지정하기
//   - 한 개 이상의 이름을 지정할 수 있다.
//   - 아이디를 지정하지 않으면 첫 번째 별명이 아이디로 사용된다.
//   - 콤마(,)/세미콜론(;)/공백으로 별명을 구분한다
//   - 문법
//      <bean name= "별명1 별명2 별명3" class="클래스명" / >
//      <bean name= "별명1,별명2,별명3" class="클래스명" / >
//      <bean name= "별명1;별명2;별명3" class="클래스명" / >
   

package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

    public static void main(String[] args) {
        
        
        ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ex03/app-context-3.xml");
        
        System.out.println("-----------------------------------------");
        
        // 컨테이너에 들어 있는 객체의 이름 알아내기
        int count = iocContainer.getBeanDefinitionCount();
        System.out.printf("bean 개수 = %d\n", count);
        
        String [] names = iocContainer.getBeanDefinitionNames();
      
        for(String name : names) {
           
           System.out.printf("=> [%s : %s]\n", name, iocContainer.getType(name).getName());
           
          String [] aliases = iocContainer.getAliases(name);
          System.out.println("    별명들:");
          for(String alias : aliases) {
              System.out.println("    =>"+alias);
          }
          System.out.println();
       }
        System.out.println("-----------------------------------------");
        
        // 1) 이름으로 꺼내기
        Car c1 = (Car)iocContainer.getBean("n1");
        System.out.println(c1);
        
        // 2) 별명으로 꺼낼때도 같은 메서드를 사용한다.
        Car c2 = (Car)iocContainer.getBean("a1");
        System.out.println(c2);
        
        // 3) 타입으로 꺼낼 수 있다.
        Car c3 = (Car)iocContainer.getBean(Car.class);
        
        System.out.println(c3);
        
        //컨테이너는 기본으로 한개의 객체만 생성한다
        if(c1 == c2) System.out.println("c1 == c2");
        if(c1 == c3) System.out.println("c1 == c3");
        
        // 존재하지 않는 개체를 꺼내려 할 때는 예외 발생!
      /*  Car c4 = (Car)iocContainer.getBean("xx");*/
       try { 
        Car c4 = (Car)iocContainer.getBean("xx");
       }catch(Exception e){
           System.out.println("xx라는 이름의 객체가 없습니다.");
       }
        
    }
    
}
