package ppg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ppg.demo.pojo.Book;
import ppg.demo.pojo.Result;
import ppg.demo.service.BookService;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping
    public Result getAllBooks() {
        List<Book> books = bookService.findAllBook();
//        int i=8/0;
        System.out.println(books);
        return new Result("54546564","good",books);
    }

    @GetMapping("/{id}")
    public Result getBookById(@PathVariable Integer id) {
        System.out.println("id->" + id);
        Book book = bookService.findById(id);
        return new Result("200100","success",book);
    }

    @PostMapping("/{bookName}/{bookCode}")
    public Result addBook(Book book) {
        System.out.println("新增book->" + book);
        return new Result("200200","add success",book);
    }

    @PostMapping
    public Result addBook1(@RequestBody Book book) {
        System.out.println("新增book1->" + book);
        bookService.addBook(book);
        return new Result("200200","add success",book);
    }

    @PostMapping("/{id}")
    public Result delBookById(@PathVariable Integer id){
        Book book=bookService.findById(id);
        boolean flag = bookService.deleteBookById(id);
        if (flag){
            return new Result("666","delete succeed",book);
        }else {
            return new Result("666","delete failed",book);
        }

    }

    @PostMapping("/update")
    public Result updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        return new Result("66665","update succeed",book);
    }
}
