package org.gu.borrowing.application.outboundservice;


import org.gu.borrowing.infrastructure.broker.rabbitmq.BookBorrowingEventSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 *
 */
@Service
@EnableBinding(BookBorrowingEventSource.class)
public class BookBorrowingEventPublisherService {

    BookBorrowingEventSource bookBorrowingEventSource;

    public BookBorrowingEventPublisherService(BookBorrowingEventSource bookBorrowingEventSource){
        this.bookBorrowingEventSource = bookBorrowingEventSource;
    }

    @TransactionalEventListener
    public void handleBookBorrowedEvent(BookBorrowingEventSource bookBorrowedEvent){
        try {
            bookBorrowingEventSource.borrow().send(MessageBuilder.withPayload(bookBorrowedEvent).build());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
