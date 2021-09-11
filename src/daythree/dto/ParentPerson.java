package daythree.dto;

public class ParentPerson {
    private String name;
    private int age;

    public ParentPerson() {
    }

    public ParentPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
