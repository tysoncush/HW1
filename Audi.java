package homework1;

public class Audi extends Vehicle implements RaceCarFunctionalities
{
    Audi(double price, String m, int g) {
        super(price ,g);
        m = "AudiTT";


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

}