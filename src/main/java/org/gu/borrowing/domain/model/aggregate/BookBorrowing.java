package org.gu.borrowing.domain.model.aggregate;

import org.gu.borrowing.domain.model.command.BookBorrowingCommand;
import org.gu.shareddomain.event.BookBorrowedEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.List;

public class BookBorrowing extends AbstractAggregateRoot<BookBorrowing> {

    private String userId;

    private List<Book> booksList;

    public List<Book> getBooksList() {
        return booksList;
    }


    public boolean borrow(BookBorrowingCommand bookBorrowingCommand) {
        //一人のユーザは3冊以上（予約のも含めて）借入できないチェック
        if(booksList.size()+bookBorrowingCommand.getBookList().size()>3){
            throw new RuntimeException("3冊以上借入できません。");
        }

        //すでにisbnが同じな借入た本を借入ができない


        addDomainEvent(new BookBorrowedEvent(userId,bookBorrowingCommand.getBookList(),bookBorrowingCommand.getBorrowTime()));
        return true;
    }


    private void addDomainEvent(Object event) {
        registerEvent(event);
    }
}
