import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
     //1) 키보드 입력을 처리할 객체 준비
     Scanner keyIn = new Scanner(System.in);
     
     //2)회원정보 입력받기
     System.out.println("이름? ");
     String name = keyIn.nextLine();
     
     System.out.println("이메일? ");
     String email = keyIn.nextLine();
     
     System.out.println("암호? ");
     String password = keyIn.nextLine();
     
     
    System.out.printf("%s, %s, %s\n", name , email, password);
    }
}
