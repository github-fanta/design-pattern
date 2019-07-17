package pattern16_mediator.demo1_withoutmediator;

public abstract class Person {
    private String name;
    private int conditionLevel; // 条件等级 为了门当户对

    public Person(String name, int conditionLevel) {
        this.name = name;
        this.conditionLevel = conditionLevel;
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

    public abstract void getParter(Person person);
}
