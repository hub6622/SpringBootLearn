package ppg.demo.service;

import ppg.demo.pojo.Book;
import java.util.List;

public interface BookService {
    void addBook(Book book);
    Book findById(Integer id);
    List<Book> findAllBook();
    boolean deleteBookById(Integer id);
    void updateBook(Book book);
}
