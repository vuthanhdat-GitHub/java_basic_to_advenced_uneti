package dayfor.dto;

public class EmployeeDetail extends Employee {
    private String department;

    public EmployeeDetail() {
        super();
    }

    public EmployeeDetail(String department) {
        this.department = department;
    }

    public EmployeeDetail(String name, String gender, String address, String birthDay, String username, String password, String department) {
        super(name, gender, address, birthDay, username, password);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
