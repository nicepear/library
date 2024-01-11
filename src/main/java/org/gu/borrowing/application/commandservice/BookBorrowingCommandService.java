package org.gu.borrowing.application.commandservice;

import org.gu.borrowing.domain.model.aggregate.Book;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.model.command.BookBorrowingCommand;
import org.gu.borrowing.domain.repository.BookBorrowingRepository;
import org.gu.borrowing.domain.repository.BookRepository;
import org.gu.borrowing.interfaces.rest.dto.BookDto;
import org.springframework.stereotype.Service;


@Service
public class BookBorrowingCommandService {

    private BookBorrowingRepository bookBorrowingRepository;


    private BookRepository bookRepository;
    public BookBorrowingCommandService(BookBorrowingRepository bookBorrowingRepository){
        this.bookBorrowingRepository = bookBorrowingRepository;
    }

    public boolean borrow(BookBorrowingCommand bookBorrowingCommand){

        //ドメインサービスでやるチェック
        //本はすでにほかの人に貸し出し中あるいは予約された状態なら、借入できない
        for(BookDto bookDto:bookBorrowingCommand.getBookDtoList()){
            Book book=bookRepository.find(bookDto.getBookNumber());
            if(!book.isBorrowable()){
                throw new RuntimeException(bookDto.getBookNumber()+bookDto.getBookName()+"貸し出し不可能");
            }
        }

        BookBorrowing bookBorrowing=bookBorrowingRepository.find(bookBorrowingCommand.getUserId());
        bookBorrowing.borrow(bookBorrowingCommand);
        bookBorrowingRepository.save(bookBorrowing);
        return true;
    }


 }
