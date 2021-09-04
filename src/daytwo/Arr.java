package daytwo;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int index = 0 ; index < n ; index++) {
            System.out.println("Nhap vao phan tu vi tri " + (index+1) + ": ");
            arr[index] = scanner.nextInt();
        }
        //
        for (int index = 0 ; index < arr.length ; index++) {
            for (int index2 = index + 1; index2 < arr.length ; index2++) {
                if (arr[index] > arr[index2]) {
                    int temp = arr[index];
                    arr[index] = arr[index2];
                    arr[index2] = temp;
                }
            }
        }
        for (int index = 0 ; index < arr.length ; index++) {
            System.out.println("phan tu vi tri " + (index+1) + " la: " + arr[index]);
        }
    }
}
