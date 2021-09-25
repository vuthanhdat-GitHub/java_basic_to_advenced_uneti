package dayfor.service;

import dayfor.dto.Student;

import java.util.List;
import java.util.Scanner;

public interface LogicServiceInterface {
    List<Student> insert(Scanner scanner);
    void show(List<Student> students);
}
