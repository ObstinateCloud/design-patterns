package com.lengedyun.iterator_tj;

/**
 * @title: IteratorTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/4/24 17:46
 */
public class IteratorTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(6);
        bookShelf.addBook(new Book("java"));
        bookShelf.addBook(new Book("c++"));
        bookShelf.addBook(new Book("c#"));
        bookShelf.addBook(new Book("python"));
        bookShelf.addBook(new Book("golang"));
        bookShelf.addBook(new Book("js"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book next = (Book) iterator.next();
            System.out.println(next.getName());

        }
    }
}
