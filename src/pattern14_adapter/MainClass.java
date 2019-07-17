package pattern14_adapter;

public class MainClass {
    public static void main(String[] args) {
        OldComponent oldComponent = new OldComponent();
        System.out.println("用户使用电压"+oldComponent.use220V()+"V");

        AdapterWithExtends adapter1 = new AdapterWithExtends();
        System.out.println("继承方式：用户使用电压：" + adapter1.use20V()+"V");

        AdapterWithDelegation adapter2 = new AdapterWithDelegation(oldComponent);
        System.out.println("委托(聚合实现)方式：用户使用电压：" + adapter2.use20V()+"V");
    }
}
