package pattern18_iterator;

import java.util.Iterator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.add(new Book("890112", "Java编程思想", 20));
        bookList.add(new Book("890113", "C++内存模型", 40.5));
        bookList.add(new Book("890114", "高性能MySQL", 60.9));

        // 第一种 将遍历交给容器实现
        while (bookList.hasNext()) {
            Book book1 = (Book)bookList.next();
            book1.display();
        }
        System.out.println("-------------------------");
        // 第二种 直接拿到数据结构，自己看着遍历
        List<Book> dataList = bookList.getDataList();
        for (Book book : dataList) {
            book.display();
        }
        System.out.println("-------------------------");
        // 直接拿到迭代器迭代
        Iterator iterator = bookList.iterator();
        Book book = null;
        while (iterator.hasNext()) {
            book = (Book)iterator.next();
            book.display();
        }

    }
}
