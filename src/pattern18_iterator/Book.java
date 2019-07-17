package pattern18_iterator;

public class Book {
    private String ISBN; // 全球唯一
    private String name;
    private double price;

    public Book(String ISBN, String name, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("ISBN:" + this.ISBN + " 书名：" + this.name + " 价格：" + this.price);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
