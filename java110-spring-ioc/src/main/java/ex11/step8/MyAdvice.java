package ex11.step8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 원래 메서드에 넘어갈 파라미터 값과
// 원래 메서드가 리턴하는 값을 알아내기
//
@Component
@Aspect
public class MyAdvice {

    @Before("execution(* ex11.step8.ServiceImpl.*(..)) and args(f)")
    public void before(String f) {
        System.out.println("MyAdvice.before(): " + f);
    }
    
    // advice의 메서드에서 호출된 메서드의 리턴 값을 확인하고 싶다면,
    // 다음과 같이 설정해야 한다.
    // <aop:after-returning method="afterReturning"
    // pointcut="execution(* ex11.step6.ServiceImpl.addPhoto(..))"
    // returning="rt"/>
    
    @AfterReturning(
            pointcut="execution(* ex11.step8.ServiceImpl.*(..))",
            returning="rt"
            )
    public void afterReturning(Object rt) {
        System.out.println("MyAdvice.afterReturning(): " + rt.toString());
    }
    
    // advice의 메서드에서 호출된 메서드의 예외 정보를 확인하고 싶다면,
    // 다음과 같이 설정해야 한다.
    // <aop:after-throwing method="afterThrowing"
    //         pointcut="execution(* ex11.step6.ServiceImpl.addPhoto(..))"
    //         throwing="err"/>
    
    
    @AfterThrowing(
            pointcut="execution(* ex11.step8.ServiceImpl.*(..))",
            throwing="err"
            )
    public void afterThrowing(Exception err) {
        System.out.println("MyAdvice.afterThrowing(): " + err.getMessage());
    }
    
}
