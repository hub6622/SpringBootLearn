package ppg.demo.service;

import ppg.demo.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Integer id);
    int insertBook(Book book);
}
