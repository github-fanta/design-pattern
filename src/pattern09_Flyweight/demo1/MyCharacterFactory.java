package pattern09_Flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
    private static  Map<Character, MyCharacter> pool = new HashMap<>();

    public MyCharacter getMyCharacter(Character ch){
        MyCharacter myChar = pool.get(ch);
        if (myChar == null) {
            myChar = new MyCharacter(ch);
            pool.put(ch, myChar);
        }
        return myChar;
    }
}
