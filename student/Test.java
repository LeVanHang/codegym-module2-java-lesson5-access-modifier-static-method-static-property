package student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập tên: ");
//        String n1 = sc.nextLine();
//        System.out.println("nhập lớp");
//        String c1 = sc.nextLine();
        Student s = new Student();
        System.out.println("thông tin học viên: " + s.getClasses()+ s.getName());
    }
}
