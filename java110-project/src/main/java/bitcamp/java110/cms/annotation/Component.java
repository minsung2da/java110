package bitcamp.java110.cms.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/*에노테이션 유지 정책
 *CLASS : 컴파일 후에도 .class 파일에 남겨 둔다. 단 실행할 때는 참조 할 수 없다.
 *        Reflection API 클래스 파일에서 애노테이션 정보를 추출 할 수 없다.
 *        에노테이션 유지 정책을 지정하지 않으면 CLASS가 기본 값이다.
 *        
 * SOURCE : 컴파일 할 때 제거된다. 즉 .class 파일에 남겨두지 않는따
 * 
 * RUNTIME: 컴파일 한 후에도 .class 파일에 남겨 둔다. 실행할 때도 참조할 수 있다.
 *          Reflection API로 클래스에서 애노테이션 정보를 추출 할 수 있다.
 * 
 * */

@Retention(RetentionPolicy.RUNTIME) //컴파일 후에도  .class 파일에 남겨둔다
                                        //실행할 때는 참조할 수 없다.
public @interface Component {

   /* String value();
    //value 는  필드형식을 가진 property메소드
*/    
    
    String value() default ""; 
    
    
}
