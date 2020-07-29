public class Plane extends Vehicle implements Flyable, Driveable{

    private String name;
    private String color;


    public Plane(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Plane() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Plane(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void manage() {

    }

    public void fly() {

    }
    public void wash() {
        System.out.println("Моюсь как самолёт");

    }
}
