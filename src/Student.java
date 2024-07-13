import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double[] marks;

    public Student(String name, int age, double[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getMarks() {
        return marks;
    }

    public double getAverageMarks() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    public void displayInfo(){
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Tuổi sinh viên: " + age);
        System.out.print("Điểm số sinh viên: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        //System.out.println(Arrays.toString(marks));
        System.out.println();
        System.out.println("Điểm trung bình sinh viên: " + getAverageMarks());
    }
}
