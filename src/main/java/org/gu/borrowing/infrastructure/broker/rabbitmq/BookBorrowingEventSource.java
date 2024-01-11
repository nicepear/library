package org.gu.borrowing.infrastructure.broker.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Interface depicting all output channels
 */
public interface BookBorrowingEventSource {

    @Output("BorrowingChannel")
    MessageChannel borrow();

    @Output("ReturnChannel")
    MessageChannel returnBook();

}
