package org.gu.borrowing.interfaces.rest.transformer;

import org.gu.borrowing.domain.model.command.BookBorrowingCommand;
import org.gu.borrowing.interfaces.rest.dto.BookBorrowingResource;

/**
 * Assembler class to convert the Book Cargo Resource Data to the Book Cargo Model
 */
public class BookBorrowingCommandDTOAssembler {


    public static BookBorrowingCommand toCommandFromDTO(BookBorrowingResource bookBorrowingResource){

        return new BookBorrowingCommand(
                bookBorrowingResource.getUserId(),
                bookBorrowingResource.getBookList(),
                bookBorrowingResource.getBorrowTime());
    }
}
