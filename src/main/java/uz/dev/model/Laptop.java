package uz.dev.model;

public class Laptop {
    private int code;
    private String model;
    private int speed;
    private int ram;
    private int hd;
    private float price;
    private int screen;

    public Laptop(int code, String model, int speed, int ram, int hd, float price, int screen){
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.price = price;
        this.screen = screen;
    }

    public Laptop(){

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", price=" + price +
                ", screen=" + screen +
                '}';
    }
}
