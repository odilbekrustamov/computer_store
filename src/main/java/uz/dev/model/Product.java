package uz.dev.model;

public class Product {
    private String maker;
    private String model;
    private String type;

    public Product(String maker, String model, String type){
        this.maker = maker;
        this.model = model;
        this.type = type;
    }

    public Product(){

    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
