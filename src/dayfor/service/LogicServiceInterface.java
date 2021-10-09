package dayfor.service;

import dayfor.dto.Student;

import java.util.List;
import java.util.Scanner;

public interface LogicServiceInterface {
    List<Student> insert(Scanner scanner);
    List<Student> insert(Scanner scanner , int status);
    void insert(Scanner scanner , int status , String action);
    void show(List<Student> students);
    void delete(List<Student> students, Scanner scanner);
}
