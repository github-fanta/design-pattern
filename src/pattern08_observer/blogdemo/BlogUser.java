package pattern08_observer.blogdemo;

import java.util.Observable;

/**
 * 博主：发布者  被观察者
 */
public class BlogUser extends Observable {

    private String name;
    public BlogUser(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    /*
     * 博主发布新文章
     */
    public void publishArticle(Article article) {
        System.out.println(name + " 发布 文章标题:" + article.getTitle() + "; 文章内容：" + article.getContent());
        // 设置状态已经改变  在遍历执行update()时，会检测是否change 如果没有change就不遍历执行update了
        this.setChanged();
        // 可以传参给观察者（update方法）
        this.notifyObservers(article);
    }
}
