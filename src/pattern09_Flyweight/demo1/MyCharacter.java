package pattern09_Flyweight.demo1;

public class MyCharacter {

    private char myChar;
    MyCharacter(char myChar) {
        this.myChar = myChar;
    }
    public void display() {
        System.out.println(myChar);
    }
}
