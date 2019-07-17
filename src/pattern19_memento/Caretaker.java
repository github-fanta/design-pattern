package pattern19_memento;

/**
 * 备份的管理者
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    public Memento getMemento() {
        return memento;
    }
}
