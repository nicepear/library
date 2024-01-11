package org.gu.borrowing.domain.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gu.borrowing.domain.model.aggregate.Book;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.repository.entity.BookBorrowingEntity;
import org.gu.borrowing.domain.repository.entity.BookEntity;

@Mapper
public interface BookRepository {
//    public List<BookEntity> searchBookBorrowingList(String userId);

    public Book find(String bookNumber);

}