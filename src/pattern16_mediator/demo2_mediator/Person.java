package pattern16_mediator.demo2_mediator;

public abstract class Person {
    private String name;
    private int conditionLevel; // 条件等级 为了门当户对
    private Mediator mediator;
    public Person(String name, int conditionLevel, Mediator mediator) {
        this.name = name;
        this.conditionLevel = conditionLevel;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConditionLevel() {
        return conditionLevel;
    }

    public void setConditionLevel(int conditionLevel) {
        this.conditionLevel = conditionLevel;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getParter(Person person);
}
