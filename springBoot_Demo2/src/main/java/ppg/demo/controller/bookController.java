package ppg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ppg.demo.pojo.Book;
import ppg.demo.pojo.Result;
import ppg.demo.service.BookService;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/20 22:05
 **/
@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    BookService bookService;
    @GetMapping()
    public Result getBook(){
        return new Result("200","succeed",bookService.findAll());
    }
    @PostMapping()
    public Result insertBook(@RequestBody Book book){
        bookService.insertBook(book);
        return new Result("200","succeed",book);
    }
}
