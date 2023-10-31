package ObjectAndClasses.Exercises.VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private String hp;


    public Vehicle(String type, String model, String color, String hp){
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel(){
        return this.model;
    }

    public String getColor() {
        return this.color;
    }
    public String getHp() {
        return this.hp;
    }
}
