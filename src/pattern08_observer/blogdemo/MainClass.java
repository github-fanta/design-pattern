package pattern08_observer.blogdemo;

public class MainClass {
    public static void main(String[] args) {
        BlogUser blogUser = new BlogUser("张三");
        blogUser.addObserver(new MyObserver()); // 添加一个监听器

        // 发布文章，触发事件
        blogUser.publishArticle(new Article("新博客", "博客上线了，多光顾哦~"));
    }
}
