package ppg.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ppg.demo.pojo.Book;

import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/20 22:09
 **/
@Mapper
public interface BookMapper {
    @Select("select * from t_book")
    List<Book> findAll();
    @Select("select * from t_book where book_id=#{id}")
    Book findById(Integer id);

    int insertBook(Book book);
}
