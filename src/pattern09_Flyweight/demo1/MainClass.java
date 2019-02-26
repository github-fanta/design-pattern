package pattern09_Flyweight.demo1;

/**
 * Flyweight模式也叫享元模式，是构造模式之一，它通过与其他类似对象共享数据
 * 来减小内存占用
 */
public class MainClass {
    public static void main(String[] args) {
        MyCharacter myChar1 = new MyCharacter('a');
        MyCharacter myChar2 = new MyCharacter('a');
        MyCharacter myChar3 = new MyCharacter('b');
        myChar3.display();
        System.out.println( (myChar1 == myChar2) + " " + (myChar2 == myChar1));

        //
        MyCharacterFactory factory = new MyCharacterFactory();
        MyCharacter myChar11 = factory.getMyCharacter('a');
        MyCharacter myChar22 = factory.getMyCharacter('a');
        MyCharacter myChar33 = factory.getMyCharacter('b');
        System.out.println( (myChar22 == myChar33) + " " + (myChar22 == myChar11));
    }
}
