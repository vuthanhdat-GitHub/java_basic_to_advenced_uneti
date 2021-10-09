package dayfor.dto;

import java.util.Scanner;

public class Student extends Person {
    private String studentCode;
    private String email;

    public Student() {
        super();
    }

    public Student(String studentCode, String email) {
        this.studentCode = studentCode;
        this.email = email;
    }

    public Student(String name, String gender, String address, String birthDay, String studentCode, String email) {
        super(name, gender, address, birthDay);
        this.studentCode = studentCode;
        this.email = email;
    }

    public Student(String name, String gender, String address, String birthDay) {
        super(name, gender, address, birthDay);
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input(Scanner scanner , int index) {
        System.out.println("---Nhap vao sinh vien thu "+(index + 1)+"---");
        System.out.println("Nhap vao ten: ");
        this.setName(scanner.nextLine());
        System.out.println("Nhap vao gioi tinh: ");
        this.setGender(scanner.nextLine());
        System.out.println("Nhap vao dia chi: ");
        this.setAddress(scanner.nextLine());
        System.out.println("Nhap vao ngay sinh: ");
        this.setBirthDay(scanner.nextLine());
        System.out.println("Nhap vao ma sinh vien: ");
        this.studentCode = scanner.nextLine();
        System.out.println("Nhap vao email: ");
        this.email = scanner.nextLine();
    }

    public void output(int index) {
        System.out.println("sinh vien thu "+(index+1)+": ");
        System.out.println("ten: " + this.getName());
        System.out.println("gioi tinh: " + this.getGender());
        System.out.println("dia chi: " + this.getAddress());
        System.out.println("ngay sinh: " + this.getBirthDay());
        System.out.println("ma sinh vien: " + this.getStudentCode());
        System.out.println("email: " + this.getEmail());
    }

    public void output() {
        System.out.println("ten: " + this.getName());
        System.out.println("gioi tinh: " + this.getGender());
        System.out.println("dia chi: " + this.getAddress());
        System.out.println("ngay sinh: " + this.getBirthDay());
        System.out.println("ma sinh vien: " + this.getStudentCode());
        System.out.println("email: " + this.getEmail());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", email='" + email + '\'' +
                ", name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", birthDay='" + this.getBirthDay() + '\'' +
                '}';
    }
}
