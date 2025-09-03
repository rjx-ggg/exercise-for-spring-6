package com.ssll.iocxml.di;

/**
 * ClassName: Book
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 7:54
 */
public class Book {

    private String name;
    private String author;

    private String price;

    public Book() {
        System.out.println("Book的无参构造方法执行了");
    }

    public Book(String name, String author, String price) {
        System.out.println("Book的有参构造方法执行了");
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setName(String name) {
        System.out.println("setName方法执行了");
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
