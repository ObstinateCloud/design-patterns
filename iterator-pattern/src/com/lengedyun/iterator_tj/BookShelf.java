package com.lengedyun.iterator_tj;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: BookShelf
 * @description: 书架
 * implements Aggregate
 * @auther: zhangjianyun
 * @date: 2022/4/24 16:44
 */
public class BookShelf implements Aggregate {

//    private Book[] books;  //version 1
    /**
     * version 2
     */
    private List<Book> books;

    private int last = 0;


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public BookShelf(int maxSize) {
//        books = new Book[maxSize];
        /**
         * version 2
         */
          books = new ArrayList<>();
    }

    public int getLength() {
        return last;
    }

    public void addBook(Book book) {
//        books[last] = book;
        /**
         * version 2
         */
        books.add(book);
        last++;
    }

    public Book getBookAt(int index) {
//        return books[index];
        /**
         * version 2
         */
        return books.get(index);
    }

}
