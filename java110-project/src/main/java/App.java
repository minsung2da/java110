import java.util.Scanner;


public class App {
    
    //여러속성의 값을 관리하기 쉽도록 사용자 정의 데이터 타입을 만들어 사용한다.
    
    static class Member {
        
        protected String name;
        protected String email;
        protected String password;
        
        
 //인스턴스의 메모리를 다루는 연산자 operator = setter/getter =accessor =property=message
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        
        
    }
    
    static class Student extends Member{
        protected String school;
        protected boolean working;
        protected String tel;
        
        public String getSchool() {
            return school;
        }
        public void setSchool(String school) {
            this.school = school;
        }
        public boolean isWorking() {
            return working;
        }
        public void setWorking(boolean working) {
            this.working = working;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        
    }
    
    static Student []students = new Student[100];
   
     
     static int index = 0;


  static Scanner keyIn = new Scanner(System.in);

    public static void main(String[] args) {
        
     while(true) 
     {
     String menu =  promptMenu();
     
        if(menu.equals("1"))
        {
         serviceStudentMenu();
        }else if(menu.equals("0"))
        {
          System.out.println("안녕히 가세요");
          break;
        }
      
      keyIn.close();
     }

    }
    private static void serviceStudentMenu() {
        while(true) {
         System.out.println("학생 관리> ");
         String command = keyIn.nextLine();
         if(command.equals("list"))
         {
            printMembers();
         }else if (command.equals("add"))
         {
             inputMembers();
         }else if (command.equals("quit")){
           break;
         }   
         else {
             System.out.println("유효하지 않는 명령어입니다");
           }
        }
    }


    private static String promptMenu() {
          System.out.println("[메뉴]");
          System.out.println("1. 학생 관리"); 
          System.out.println("2. 강사 관리");
          System.out.println("3. 매니저 관리");
          System.out.println("0. 종료");
          
         while(true) 
         {    
          System.out.print("메뉴 번호> ");
          
          String menu = keyIn.nextLine();
          System.out.println(menu);
          
         switch(menu) {
         case "1":
         case "2":
         case "3":
         case "0":
             return menu;
         default:
             System.out.println("메뉴 번호가 유효하지 않습니다.");
            }
          }
    }


 static void printMembers()
 {
     for(int i = 0; i<index; i++)
     {
         System.out.printf("%s, %s, %s\n", members[i].getName() , members[i].getEmail(), members[i].getPassword());
         
     }
 }

static void inputMembers()
{
    while(true) {
        
        Member m = new Member();
        
        System.out.println("이름? ");
        m.setName(keyIn.nextLine());
        
        System.out.println("이메일? ");
       m.setEmail(keyIn.nextLine());
        
        System.out.println("암호? ");
       m.setPassword(keyIn.nextLine());
      
        members[index++] = m;
    
       
       System.out.println("계속 입력 하겠습니까? (Y/n) ");
       String answer =keyIn.nextLine();
       if(answer.toLowerCase().equals("n"))
         break;

        }
}
 
}


