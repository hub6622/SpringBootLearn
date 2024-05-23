package ppg.demo.mapper;

import org.apache.ibatis.annotations.*;
import ppg.demo.pojo.Book;
import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/6 13:24
 **/
@Mapper
public interface BookMapper {
    @Select("select * from p_book")
    List<Book> selectAllBook();

    @Select("select * from p_book where bookId = #{id}")
    Book selectBookById(Integer id);
    @Insert("insert into p_book values " +
            "(null, #{bookName}, #{bookCode}, #{bookAuthor})")
    void addBook(Book book);

    @Delete("delete from p_book where bookId = #{id}")
    boolean deleteBookById(Integer id);
    @Update("update p_book set bookName=#{bookName}, " +
            "bookCode=#{bookCode}, bookAuthor=#{bookAuthor}\n" +
            "where bookId=#{bookId}")
    void updateBook(Book book);
}
