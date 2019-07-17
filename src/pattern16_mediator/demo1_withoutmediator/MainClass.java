package pattern16_mediator.demo1_withoutmediator;

public class MainClass {
    public static void main(String[] args) {
        Man zhangsan = new Man("张三", 20);
        Man lisi = new Man("李四", 20);
        Woman xiaofang = new Woman("小芳", 21);

        // 直接传另一个对象，通过自己类里面的判断交互逻辑进行判断给出结果，
        // 但是这段交互逻辑其实是可以抽取出来的，这段逻辑就是中介者。
        // 以后判断的时候直接就把这段交互逻辑(即一个中介者对象)传送进去
        zhangsan.getParter(lisi);
        zhangsan.getParter(xiaofang);
        xiaofang.getParter(zhangsan);
    }
}
