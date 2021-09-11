package daythree.dto;

public class ParentChild extends ParentPerson {
    //access modifier
    // dong goi:
    private String zClass;
    private String test;

    public ParentChild () {
        super();
    }

    public ParentChild(String test ,String zClass) {
        this.zClass = zClass;
        this.test = test;
    }

    public ParentChild(String name, int age, String zClass) {
        super(name, age);
        this.zClass = zClass;
    }

    public String getzClass() {
        return zClass;
    }

    public void setzClass(String zClass) {
        this.zClass = zClass;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
