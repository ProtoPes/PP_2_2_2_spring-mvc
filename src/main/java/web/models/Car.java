package web.models;

public class Car {
    private String brand;
    private String engine;
    private String colour;

    public Car(String brand, String engine, String colour) {
        this.brand = brand;
        this.engine = engine;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
