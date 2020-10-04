package homework1;

public class Vehicle {

    private double price;
    private String model;
    private int gears;
    Vehicle(double p, String m, int g) {
        price = p;
        model = m;
        gears = g;

    }

    double getprice(){
        return price;
    }
    String getmodel(){
        return model;
    }
    int getgears(){
        return gears;
    }

    void setprice(double p){
        p = price;
    }
    void setmodel(String m){
        m = model;
    }
    void setgears(int g){
        g = gears;
    }

}
