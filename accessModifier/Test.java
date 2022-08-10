package accessModifier;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Circle circle1 = new Circle(10);
        System.out.println("hình tròn của bạn có màu: "+ circle1.getColor() + " có bán kính: "+ circle1.getRadius()+ " có diện tích "+circle1.getArena());
    }
}
