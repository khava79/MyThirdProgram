package practice_3;

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 9);
        rectangle.print();

        rectangle.setWidth(9);
        rectangle.print();

       System.out.println("Площадь: " + rectangle.calculateArea());


    }
}
