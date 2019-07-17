package pattern21_state;

public class Person {
    private int hour;
    private State state;

    public Person() {
        state = new MorningState();
    }

    // 将自己踢皮球给state去处理
    public void doSomething(){
        state.doSomething(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
