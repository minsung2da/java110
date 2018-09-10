
import java.util.Scanner;

import bitcamp.java110.cms.annotation.RequestMapping;
import bitcamp.java110.cms.context.ApplicationContext;




public class App {

    static Scanner keyIn = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

       ApplicationContext iocContainer = 
               new ApplicationContext("bitcamp.java110.cms.control");

        while (true) {

            String menu = prompt();

            if (menu.equals("exit")){
                System.out.println("안녕히 가세요!");
                break;
            }

            Object controller = iocContainer.getBean(menu);
            if(controller!=null)
            {
                System.out.println("해당메뉴가 없습니다.");
                continue;
            }
                

          Method method = findRequestMapping(controller.getClass());
          if(method == null)  
          {
              System.out.println("해당메뉴가 없습니다.");
              continue;
          }
            
             method.invoke(controller, keyIn);
        }

        keyIn.close();
    }

    private static Method findRequestMapping(Class<?> clazz) {
        
        //=>클래스의 메서드 목록을 꺼낸다.
        Method[] methods = clazz.getDeclaredMethods();
        
        //=> 매소드에서 @requestMapping 정보를 추출한다.
        for(Method m : methods)
        {
        RequestMapping anno = m.getAnnotation(RequestMapping.class);
            
        
        if(anno != null) // 찾았다면  이 메서드를 리턴한다.
         return m;
        }
            
        return null;
    }

    private static String prompt() { 
        System.out.print("메뉴> ");
        return keyIn.nextLine();
    }

}
