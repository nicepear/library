package org.gu.borrowing.infrastructure;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gu.borrowing.domain.model.aggregate.BookBorrowing;
import org.gu.borrowing.domain.repository.entity.BookBorrowingEntity;

import java.util.List;

@Mapper
public interface BookBorrowingMapper extends BaseMapper<BookBorrowingEntity> {
//    public List<BookEntity> searchBookBorrowingList(String userId);

    public List<BookBorrowingEntity> searchBookBorrowingList(String userId); // こちらはBookBorrowingEntityにして、FactoryパターンでBookBorrowingを作成したほうがいいかも
}