package org.gu.borrowing.application.queryservice;


import org.gu.borrowing.domain.model.aggregate.Book;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.repository.BookBorrowingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBorrowingQueryService {

    private BookBorrowingRepository bookBorrowingRepository;

    public BookBorrowingQueryService(BookBorrowingRepository bookBorrowingRepository) {
        this.bookBorrowingRepository = bookBorrowingRepository;
    }

    public List<Book> find(String userId){
        BookBorrowing bookBorrowing=bookBorrowingRepository.find(userId);
        return bookBorrowing.getBooksList();
    }
}
