package dayfor.dto;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String address;
    private String birthDay;

    public Person() {
    }

    public Person(String name, String gender, String address, String birthDay) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
