public class Car extends Vehicle implements Driveable, Rideable{

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void manage() {

    }

    public void ride() {

    }
}
