package org.gu.borrowing.interfaces.rest;


import org.gu.borrowing.application.commandservice.BookBorrowingCommandService;
import org.gu.borrowing.application.queryservice.BookBorrowingQueryService;
import org.gu.borrowing.domain.model.aggregate.Book;
import org.gu.borrowing.interfaces.rest.dto.BookBorrowingResource;
import org.gu.borrowing.interfaces.rest.dto.BookDto;
import org.gu.borrowing.interfaces.rest.transformer.BookBorrowingCommandDTOAssembler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bookborrowing")
public class BookBorrowingController {


    private BookBorrowingCommandService bookBorrowingCommandService; // Application Service Dependency

    private BookBorrowingQueryService bookBorrowingQueryService;

    public BookBorrowingController(BookBorrowingCommandService bookBorrowingCommandService, BookBorrowingQueryService bookBorrowingQueryService){
        this.bookBorrowingCommandService = bookBorrowingCommandService;
        this.bookBorrowingQueryService = bookBorrowingQueryService;
    }


    @PostMapping
    @ResponseBody
    public boolean borrow(@RequestBody BookBorrowingResource bookCargoResource){
        boolean result  = bookBorrowingCommandService.borrow(
                BookBorrowingCommandDTOAssembler.toCommandFromDTO(bookCargoResource));

        return result;
    }


    @GetMapping("/borrowed_book")
    @ResponseBody
    public List<Book> findByUserId(@RequestParam("userId") String userId){

        //Domainモデルをそのまま返すのがよくない、時間がないので、こんな風にしている
        List<Book> bookList=bookBorrowingQueryService.find(userId);
        return bookList;
    }
}
