package uz.dev.model;

public class Printer {
    private int code;
    private String model;
    private String  color;
    private String type;
    private float price;

    public Printer(int code, String model, String  color, String type, float price){
        this.code = code;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public Printer(){

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String  color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
