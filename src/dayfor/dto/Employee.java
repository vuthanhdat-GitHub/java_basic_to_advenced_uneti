package dayfor.dto;

public class Employee extends Person {
    private String username;
    private String password;

    public Employee() {
        super();
    }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Employee(String name, String gender, String address, String birthDay, String username, String password) {
        super(name, gender, address, birthDay);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
