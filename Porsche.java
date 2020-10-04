package homework1;

public class Porsche extends Vehicle implements RaceCarFunctionalities
{
    Porsche(double price, String m, int g) {
        super(price, g);
    }
    void warmup_engine(){
        System.out.println("Warming up engine.");
    }
    void move_to_start(){
        System.out.println("Moving.");
    }
    void race(){
        System.out.println("Racing.");
    }
    void superservice(){
        System.out.println("I need this every three months");
    }
}
