package pattern08_observer.persondemo;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Person person = (Person)o;
        System.out.println(person.getName()+"发生改变");
    }
}
