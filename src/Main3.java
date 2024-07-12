import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên thứ nhất");
        System.out.print("Nhập tên sinh viên thứ nhất: ");
        String name1 = inputString.nextLine();
        System.out.print("Nhập tuổi sinh viên thứ nhất: ");
        int age1 = inputNumber.nextInt();
        System.out.println("Nhập điểm cho sinh viên thứ nhất");
        System.out.print("Nhập hệ số điểm: ");
        int number1 = inputNumber.nextInt();
        double[] marks1 = new double[number1];
        for (int i = 0; i < marks1.length; i++) {
            System.out.print("Điểm thứ " + (i + 1) + ": ");
            marks1[i] = inputNumber.nextDouble();
            while(marks1[i] > 10 || marks1[i] < 0) {
                System.out.println("Mời nhập lại điểm");
                System.out.print("Điểm thứ " + (i + 1) + ": ");
                marks1[i] = inputNumber.nextDouble();
            }
        }

        System.out.println("Nhập thông tin sinh viên thứ hai");
        System.out.print("Nhập tên sinh viên thứ hai: ");
        String name2 = inputString.nextLine();
        System.out.print("Nhập tuổi sinh viên thứ hai: ");
        int age2 = inputNumber.nextInt();
        System.out.println("Nhập điểm cho sinh viên thứ hai");
        System.out.print("Nhập hệ số điểm: ");
        int number2 = inputNumber.nextInt();
        double[] marks2 = new double[number2];
        for (int i = 0; i < marks2.length; i++) {
            System.out.print("Điểm thứ " + (i + 1) + ": ");
            marks2[i] = inputNumber.nextDouble();
            while(marks2[i] > 10 || marks2[i] < 0) {
                System.out.println("Mời nhập lại điểm");
                System.out.print("Điểm thứ " + (i + 1) + ": ");
                marks2[i] = inputNumber.nextDouble();
            }
        }

        Student student1 = new Student(name1, age1, marks1);
        Student student2 = new Student(name2, age2, marks2);
        System.out.println("Thông tin sinh viên thứ nhất");
        student1.displayInfo();
        System.out.println();
        System.out.println("Thông tin sinh viên thứ hai");
        student2.displayInfo();
        System.out.println();

        if(student1.getAverageMarks() > student2.getAverageMarks()) {
            System.out.println("Sinh viên thứ nhất có điểm trung bình cao hơn sinh viên thứ hai");
        } else if (student1.getAverageMarks() < student2.getAverageMarks()) {
            System.out.println("Sinh viên thứ hai có điểm trung bình cao hơn sinh viên thứ nhất");
        } else {
            System.out.println("Cả 2 sinh viên có điểm trung bình bằng nhau");
        }
    }
}
