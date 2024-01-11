package org.gu.borrowing.domain.repository.entity;

import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.model.valueobject.BorrowingStatus;

public class BookEntity {

    private String bookNumber;

    private String isbn;

    private String bookName;

    private BorrowingStatus state;

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BorrowingStatus getState() {
        return state;
    }

    public void setState(BorrowingStatus state) {
        this.state = state;
    }
}
