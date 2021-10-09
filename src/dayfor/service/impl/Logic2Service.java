package dayfor.service.impl;

import dayfor.dto.Student;
import dayfor.service.LogicServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author  datdv
 */
public class Logic2Service implements LogicServiceInterface {

    @Override
    public List<Student> insert(Scanner scanner) {
        List<Student> students = new ArrayList<>();
        System.out.println("Nhap vao so luong sinh vien: ");
        int total = scanner.nextInt();
        if (total > 2) {
            System.out.println("total nhieu qua!");
            return new ArrayList<>();
        }
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

    }

    @Override
    public void delete(List<Student> workers, Scanner scanner) {

    }
}
