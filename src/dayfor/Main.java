package dayfor;

import dayfor.dto.Student;
import dayfor.service.LogicServiceInterface;
import dayfor.service.impl.Logic2Service;
import dayfor.service.impl.LogicService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicServiceInterface logicService = new LogicService();
        System.out.println("Student Manager: ");
        List<Student> students = logicService.insert(scanner);
        logicService.show(students);
        logicService.delete(students , scanner);
    }
}
