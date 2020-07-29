public class Main {
    public static void main(String[] args) {
    //Car car = new Car();
    //car.manage();
    Plane plane = new Plane("Пузырек");
    Plane plane1 = new Plane("Птенчик", "Желтый");
    plane.setColor("Белый");
    plane.setName("Чайка");
    //plane.wash();
    System.out.println("Имя первого самолёта: " + plane.getName());
    System.out.println("Имя второго самолёта: " + plane1.getName());
    //System.out.println("Цвет: R: " + plane.getColor().getRed() + "G: " + plane.getColor().getGreen() + "B: " + plane.getColor().getBlue());
    System.out.println("Цвет первого самолёта: " + plane.getColor());
    System.out.println("Цвет второго самолёта: " + plane1.getColor());
    //plane1.getColor();
    //plane1.getName();
    }
}
