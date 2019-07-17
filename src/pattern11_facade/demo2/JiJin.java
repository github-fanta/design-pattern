package pattern11_facade.demo2;
// 基金  基金负责投资 国债 股票 期货等。向人们提供更便捷的投资方式
public class JiJin {
    private GuoZhai guoZhai;
    private GuPiao guPiao;
    private QiHuo qiHuo;
    public JiJin(){
        guoZhai = new GuoZhai();
        guPiao = new GuPiao();
        qiHuo = new QiHuo();
    }

    // 基金向外提供购买投资服务
    // 基金A: 投资国债 股票 期货
    public void buyA(){
        System.out.println("购买基金组合A：");
        guoZhai.buy();
        guPiao.buy();
        qiHuo.buy();
    }

    // 基金B: 投资国债 股票
    public void buyB(){
        System.out.println("购买基金组合B：");
        guoZhai.buy();
        guPiao.buy();
    }
}
