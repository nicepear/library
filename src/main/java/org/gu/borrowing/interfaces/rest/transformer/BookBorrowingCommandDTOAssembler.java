package org.gu.borrowing.interfaces.rest.transformer;

import com.practicalddd.cargotracker.bookingms.domain.model.commands.BookCargoCommand;
import com.practicalddd.cargotracker.bookingms.interfaces.rest.dto.BookCargoResource;
import org.gu.borrowing.domain.model.command.BookBorrowingCommand;
import org.gu.borrowing.interfaces.rest.dto.BookBorrowingResource;

/**
 * Assembler class to convert the Book Cargo Resource Data to the Book Cargo Model
 */
public class BookBorrowingCommandDTOAssembler {

    /**
     * Static method within the Assembler class
     * @param bookCargoResource
     * @return BookCargoCommand Model
     */
    public static BookBorrowingCommand toCommandFromDTO(BookBorrowingResource bookBorrowingResource){

        return new BookBorrowingCommand(
                bookBorrowingResource.getUserId(),
                bookBorrowingResource.getBookList(),
                bookBorrowingResource.getBorrowTime());
    }
}
