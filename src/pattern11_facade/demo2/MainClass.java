package pattern11_facade.demo2;
// 普通人投资
public class MainClass {

    public static void main(String[] args) {
        // 80年代以前 人们只能购买这几种来投资
        GuoZhai guoZhai = new GuoZhai();
        guoZhai.buy();
        GuPiao guPiao = new GuPiao();
        guPiao.buy();
        QiHuo qiHuo = new QiHuo();
        qiHuo.buy();

        // 之后出现了基金
        JiJin jiJin = new JiJin();
        jiJin.buyA();
        jiJin.buyB();

    }
}
