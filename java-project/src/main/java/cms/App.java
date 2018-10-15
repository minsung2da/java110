package cms;

import java.util.Scanner;

import cms.control.ManagerController;
import cms.control.StudentController;
import cms.control.TeacherController;

public class App {

    static Scanner keyIn = new Scanner(System.in);
    
    public static void main(String [] args) {
        
        StudentController.keyIn = keyIn;
        ManagerController.keyIn = keyIn;
        TeacherController.keyIn = keyIn;
      
        
    }
    
    
    
    private static String promptMenu(){
        
        System.out.println("[메뉴]");
        System.out.println("1.학생 관리");
        System.out.println("2.매니저 관리");
        System.out.println("3.강사 관리");
        System.out.println("0.종료");
      
       while(true) { 
        System.out.print("메뉴 번호 :");
        
        String menu = keyIn.nextLine();
        
        switch(menu)
        {
        case "1":
        case "2":
        case "3":
        case "0":
            System.out.println("수고하셨습니다");
            break;
        default:
            System.out.println("해당 번호가 없습니다.");
              
        }
        
       }
    }
    
    
}
