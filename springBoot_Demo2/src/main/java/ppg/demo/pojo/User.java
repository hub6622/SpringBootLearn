package ppg.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String name;
    private List<Book> books;
}
