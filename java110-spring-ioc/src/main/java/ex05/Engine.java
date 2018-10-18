package ex05;

public class Engine {

    private String maker;
    private int valve;
    private boolean isDiesel;
    
    public Engine() {
        System.out.println("Engine() 호출됨");
    }
    
    
    public Engine(String maker, int valve, boolean isDiesel) {
        this.maker = maker;
        this.valve = valve;
        this.isDiesel = isDiesel;
        
        System.out.println("Engine(String int boolean)");
    }
    
    
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        System.out.println("setMaker() 호출됨!");
        this.maker = maker;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        System.out.println("setValve() 호출됨!");
        this.valve = valve;
    }
    public boolean isDiesel() {
        return isDiesel;
    }
    public void setDiesel(boolean isDiesel) {
        System.out.println("setDiesel() 호출됨!");
        this.isDiesel = isDiesel;
    }


    @Override
    public String toString() {
        return "Engine [maker=" + maker + ", valve=" + valve + ", isDiesel=" + isDiesel + "]";
    }
    
    
    
}
