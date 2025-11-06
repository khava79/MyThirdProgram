package practice_2;

public class Main7 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        circle.setRadius(6.0);

        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());

    }
}
