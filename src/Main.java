import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle.getDisplay());
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        int length = inputNumber.nextInt();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        int width = inputNumber.nextInt();
        Rectangle rectangleChange = new Rectangle(length, width);
        System.out.println("Diện tích hình chữ nhật là: " + rectangleChange.getAcreage());
        System.out.println("Chu vi hình chữ nhật là: " + rectangleChange.getPerimeter());
        System.out.println("Hình ảnh hình chữ nhật");
        System.out.println(rectangleChange.getImage());
    }
}