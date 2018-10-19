//객체생성 : new 명령사용

package ex01;

public class Test01 {

    public static void main(String[] args) {
        
        
        Car c1 = new Car();
        c1.setModel("티코");
        c1.setCc(800);
        
        System.out.println(c1);
        
        
        System.out.println("-------------------------------");
        
        Car c2 = CarFactory1.create("소나타");
        
        System.out.println(c2);
    }
    
}
