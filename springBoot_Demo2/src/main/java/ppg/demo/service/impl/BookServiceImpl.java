package ppg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppg.demo.mapper.BookMapper;
import ppg.demo.pojo.Book;
import ppg.demo.service.BookService;

import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/20 22:09
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insertBook(book);
    }
}
