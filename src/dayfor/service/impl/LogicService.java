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
    public void show(List<Student> students) {
        int i = 0;
        for (Student student : students) {
            student.output(i);
            i++;
        }
    }

}
