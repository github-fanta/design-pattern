package pattern09_Flyweight.demo2;

public class Teacher extends Person{
    private String number;
    public Teacher(){}

    public Teacher(String name, int age, String sex, String number) {
        super(name, age, sex);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
