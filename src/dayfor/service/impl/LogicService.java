package dayfor.service.impl;

import dayfor.dto.Student;
import dayfor.service.LogicServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicService implements LogicServiceInterface {

    @Override
    public List<Student> insert(Scanner scanner) {
        List<Student> students = new ArrayList<>();
        System.out.println("Nhap vao so luong sinh vien: ");
        int total = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0 ; index < total ; index++) {
            Student student = new Student();
            student.input(scanner , index);
            students.add(student);
        }
        return students;
    }

    @Override
    public List<Student> insert(Scanner scanner, int status) {
        return null;
    }

    @Override
    public void insert(Scanner scanner, int status, String action) {

    }

    @Override
    public void show(List<Student> students) {
        //students.forEach(item -> item.output());
        //method reference
        students.forEach(Student::output); // lambda
    }

    // builder pattern : design pattern
    @Override
    public void delete(List<Student> students, Scanner scanner) {
        System.out.print("Nhap name cua cong nhan can xoa: ");
        String name = scanner.nextLine();
        Student student = students.stream()
                .filter(student1 -> student1.getName().equals(name))
                .findFirst().orElse(null);
        if (student == null) {
            System.out.println("Khong co sinh vien nao voi name: " + name);
            return;
        }
        students.remove(student);
        System.out.println("DELETE SUCCESSFULLY");
        this.show(students);
    }

}
