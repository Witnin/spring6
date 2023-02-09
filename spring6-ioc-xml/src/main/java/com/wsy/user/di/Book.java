package com.wsy.user.di;

/**
 * @author within
 * @date 2023-02-06 16:53
 */
public class Book {
    private String bName;

    private String bAuthor;
    private String others;

    //生成set方法

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book(String bName, String bAuthor) {
        System.out.println("有参数构造执行了。。。");
        this.bName = bName;
        this.bAuthor = bAuthor;
    }

    public Book() {
        System.out.println("无参数构造执行了。。。");
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setbAuthor("@within");
        book.setbName("软件ai");
        System.out.println(book);
        System.out.println(book.getbAuthor());
        Book book1 = new Book("PS","@Within");
        System.out.println(book1);
    }
}
