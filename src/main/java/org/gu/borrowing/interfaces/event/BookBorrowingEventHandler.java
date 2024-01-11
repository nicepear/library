package org.gu.borrowing.interfaces.event;


import org.gu.borrowing.infrastructure.broker.rabbitmq.BookBorrowingBinding;
import org.gu.shareddomain.event.BookBorrowedEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;


@Service
@EnableBinding(BookBorrowingBinding.class)
public class BookBorrowingEventHandler {

//    private HogeCommandService HogeCommandService; // Application Service Dependency



    @StreamListener(target = BookBorrowingBinding.HANDLING)
    public void receiveEvent(BookBorrowedEvent bookBorrowedEvent) {
        //Process the Event
    }
}
