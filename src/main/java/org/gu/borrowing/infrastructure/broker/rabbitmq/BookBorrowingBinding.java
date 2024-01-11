package org.gu.borrowing.infrastructure.broker.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BookBorrowingBinding {

    String HANDLING = "BorrowChannel";

    @Input(HANDLING)
    SubscribableChannel borrowHandling();
}
