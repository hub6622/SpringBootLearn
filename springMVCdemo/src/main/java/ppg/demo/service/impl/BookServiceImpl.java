package ppg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppg.demo.mapper.BookMapper;
import ppg.demo.pojo.Book;
import ppg.demo.service.BookService;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;


    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Book> findAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public boolean deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }
}
