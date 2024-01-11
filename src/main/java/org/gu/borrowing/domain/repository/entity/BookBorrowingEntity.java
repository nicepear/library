package org.gu.borrowing.domain.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="BOOK_BORROW_HISTORY")
public class BookBorrowingEntity {

    private String userId;
    private String bookNumber;

    private String isbn;

    private String bookName;

    private LocalDateTime borrowTime;

    private LocalDateTime returnTime;

    private LocalDateTime reserveTime;

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
