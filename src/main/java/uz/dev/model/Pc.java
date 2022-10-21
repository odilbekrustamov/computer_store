package uz.dev.model;

public class Pc {
    private int code;
    private String model;
    private int speed;
    private int ram;
    private int hd;
    private String cd;
    private float price;

    public Pc(int code, String model, int speed, int ram, int hd, String cd, float price){
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.cd = cd;
        this.price = price;
    }

    public Pc(){

    }

    public void setCode(int code) {
        this.code = Pc.this.code;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", cd='" + cd + '\'' +
                ", price=" + price +
                '}';
    }
}
