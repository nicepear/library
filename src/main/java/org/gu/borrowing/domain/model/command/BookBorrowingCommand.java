package org.gu.borrowing.domain.model.command;


import org.gu.borrowing.domain.model.aggregate.Book;
import org.gu.borrowing.interfaces.rest.dto.BookDto;

import java.time.LocalDateTime;
import java.util.List;

public class BookBorrowingCommand {

    private String userId;
    private List<Book> bookList;
    private LocalDateTime borrowTime;

    private List<BookDto> bookDtoList;
    public BookBorrowingCommand(){}

    public BookBorrowingCommand(String userId,
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

    public List<BookDto> getBookDtoList() {
        return bookDtoList;
    }

    public void setBookDtoList(List<BookDto> bookDtoList) {
        this.bookDtoList = bookDtoList;
    }
}
