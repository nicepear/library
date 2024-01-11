package org.gu.borrowing.domain.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.repository.entity.BookBorrowingEntity;
import org.gu.borrowing.domain.repository.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface BookBorrowingRepository {
//    public List<BookEntity> searchBookBorrowingList(String userId);

    public BookBorrowing find(String userId); // こちらはBookBorrowingEntityにして、FactoryパターンでBookBorrowingを作成したほうがいいかも

    public boolean save(BookBorrowing bookBorrowing);
}