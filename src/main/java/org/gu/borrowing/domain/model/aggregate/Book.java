package org.gu.borrowing.domain.model.aggregate;

import org.gu.borrowing.domain.model.valueobject.BorrowingStatus;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.time.LocalDateTime;

public class Book extends AbstractAggregateRoot<Book> {

    private String bookNumber;

    private String isbn;

    private LocalDateTime borrowTime;

    private LocalDateTime returnTime;

    private LocalDateTime reserveTime;

    private String userId;

    private BorrowingStatus state;

    public boolean isBorrowable(){
        return state.equals(BorrowingStatus.FREE);
    }

}
