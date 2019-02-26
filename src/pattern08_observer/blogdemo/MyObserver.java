package pattern08_observer.blogdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class MyObserver implements Observer {


    /**
     * 将程序员的监听变化后触发要做的事情，写在这里 插入到被观察者的指定位置执行
     * @param o
     * @param arg 通过
     */
    @Override
    public void update(Observable o, Object arg) {
        BlogUser blogUser = (BlogUser) o;
        System.out.println("\n观测对象:" + blogUser.getName());

        Article article = (Article)arg;
        System.out.println("\n您订阅的博主 " + blogUser.getName() + " 发布了文章:\n标题:" + article.getTitle()
            + "\n文章内容：" + article.getContent());
    }
}
