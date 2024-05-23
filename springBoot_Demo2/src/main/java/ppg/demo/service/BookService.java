package ppg.demo.service;

import ppg.demo.pojo.Book;

import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/20 22:08
 **/
public interface BookService {
    List<Book> findAll();
    Book findById(Integer id);
    int insertBook(Book book);
}
