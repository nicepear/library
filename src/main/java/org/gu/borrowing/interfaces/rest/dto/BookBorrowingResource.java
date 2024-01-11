package org.gu.borrowing.interfaces.rest.dto;

import org.gu.borrowing.domain.model.aggregate.Book;

import java.time.LocalDateTime;
import java.util.List;

public class BookBorrowingResource {
    private String userId;
    private List<Book> bookList;
    private LocalDateTime borrowTime;

    public BookBorrowingResource(){}

    public BookBorrowingResource(String userId,
                                List<Book> bookList, LocalDateTime borrowTime){

        this.userId = userId;
        this.userId = userId;
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
