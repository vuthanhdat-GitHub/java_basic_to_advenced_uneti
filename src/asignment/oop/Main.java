package asignment.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu dai");
        float longs = scanner.nextFloat();
        System.out.println("Nhap vao chieu rong");
        float width = scanner.nextFloat();
        Rectangular rectangular = new Rectangular(longs , width);
        System.out.println("chu vi la: " + rectangular.perimeter());
        System.out.println("dien tich là: " + rectangular.area());
    }
}
