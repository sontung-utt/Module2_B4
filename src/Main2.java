import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = inputNumber.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = inputNumber.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = inputNumber.nextInt();
        QuadraticEqualtion quadraticEqualtion = new QuadraticEqualtion(a, b, c);
        if(a == 0){
            if(b != 0){
                System.out.println("Phương trình có 1 nghiệm đơn là: " + quadraticEqualtion.getSameRoot());
            }
            else {
                if(c == 0){
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            if(quadraticEqualtion.getDiscriminant() > 0){
                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("Nghiệm thứ nhất của phương trình là: " + quadraticEqualtion.getRoot1());
                System.out.println("Nghiệm thứ hai của phương trình là: " + quadraticEqualtion.getRoot2());
            } else if (quadraticEqualtion.getDiscriminant() == 0){
                System.out.println("Phương trình có 1 nghiệm kép là: " + quadraticEqualtion.getSameRoot2());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
