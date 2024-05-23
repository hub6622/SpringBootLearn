package ppg.demo.service;

import ppg.demo.pojo.Book;
import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/6 13:21
 **/
public interface BookService {
    void addBook(Book book);
    Book findById(Integer id);
    List<Book> findAllBook();
    boolean deleteBookById(Integer id);
    void updateBook(Book book);
}
