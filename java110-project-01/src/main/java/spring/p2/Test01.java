//IoC 컨테이너 : ClassPathXmlApplicationContext
// => 스프링 컨테이너의 설정 정보는 XML파일에 기록한다
// => 스프링  자바의 classpath에서 설정 파일을 찾는다 
//
//스프링 IoC 컨테이너의 계층도
// 
//  BeanFactory 인터페이스 
//  |
//  +-  ApplicationContext 인터페이스
//   -  ClassPathXmlApplicationContext 클래스
//   -  FileSystemXmlPathApplicationContext 클래스
//   -  AnnotationConfigApplicationContext클래스
//       |      
//       +-  WebApplicationContext 인터페이스 (웹 애플리케이션에서 사용)
//        -  StaticWepApplcationContext 클래스                  
//        -  XmlWepApplicationContext 클래스 
//        -  AnnotationConfigWebApplication 클래스 

package spring.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public static void main(String[] args) {
        
        //생성자에 넘겨준 Spring 설정 파일의 경로는 
        //자바의 classpath 경로이다.
        ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("spring/p1/app-context-1.xml");
        
        
      
       
    }
    
}
