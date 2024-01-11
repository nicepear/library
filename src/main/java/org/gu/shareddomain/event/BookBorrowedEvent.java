package org.gu.shareddomain.event;

import org.gu.borrowing.domain.model.aggregate.Book;

import java.time.LocalDateTime;
import java.util.List;

public class BookBorrowedEvent {

    private String userId;

    private List<Book> bookList;

    private LocalDateTime borrowTime;

    public BookBorrowedEvent(String userId, List<Book> bookList, LocalDateTime borrowTime) {
        this.userId = userId;
        this.bookList = bookList;
        this.borrowTime = borrowTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public LocalDateTime getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(LocalDateTime borrowTime) {
        this.borrowTime = borrowTime;
    }
}
