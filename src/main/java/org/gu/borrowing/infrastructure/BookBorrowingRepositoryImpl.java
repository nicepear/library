package org.gu.borrowing.infrastructure;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.repository.BookBorrowingRepository;
import org.gu.borrowing.domain.repository.entity.BookBorrowingEntity;

import java.util.List;

@Mapper
public class BookBorrowingRepositoryImpl implements BookBorrowingRepository {
//    public List<BookEntity> searchBookBorrowingList(String userId);

    private BookBorrowingMapper bookBorrowingMapper;

 //   private HogeMapper hogeMapper;

    public BookBorrowingRepositoryImpl(BookBorrowingMapper bookBorrowingMapper) {
        this.bookBorrowingMapper = bookBorrowingMapper;
    }

    public BookBorrowing find(String userId){
        List<BookBorrowingEntity> bookBorrowingEntity=bookBorrowingMapper.searchBookBorrowingList(userId);
        BookBorrowing bookBorrowing=new BookBorrowing();

        return bookBorrowing;
    };
    public boolean save(BookBorrowing bookBorrowing){
        BookBorrowingEntity bookBorrowingEntity=new BookBorrowingEntity();
       //こちらはinsertとupdateの煩雑なロジックを実装する必要がある、一旦スキップ
        bookBorrowingMapper.insert(bookBorrowingEntity);
        return  true;
    };
}