package pattern18_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    private List<Book> booklist;  // 为了方便，可以用数组
    private int index = 0;

    public BookList() {
        this.booklist = new ArrayList<>();
    }

    public void add(Book book) {
        booklist.add(book);
    }
    public void remove(Book book) {
        booklist.remove(book);
    }

    // 第一种方法 把遍历交给容器实现
    public boolean hasNext() {
        if (index < booklist.size()) {
            return true;
        }
        return false;
    }

    public Object next() {
        return booklist.get(index++);
    }
    // 第二种方法 将数据结构暴露给用户，用户根据数据结构特点自己去实现遍历
    public List<Book> getDataList() {
        return booklist;
    }

    // 第三种方法 聚合迭代器
    // 返回迭代器
    public Iterator iterator() {
        return new Itr();
    }
    private class Itr implements Iterator {

        public Itr() {
            index = 0;
        }
        @Override
        public boolean hasNext() {
            if (index < booklist.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return booklist.get(index++);
        }
    }
}
