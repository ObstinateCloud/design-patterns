package com.lengedyun.iterator_tj;

/**
 * @title: BookShelfIterator
 * @description: 书架迭代器
 * @auther: zhangjianyun
 * @date: 2022/4/24 17:34
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength() ? true : false;
    }

    @Override
    public Book next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }
}
