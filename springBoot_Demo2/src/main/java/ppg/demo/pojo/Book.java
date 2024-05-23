package ppg.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 肖奕杰
 * @Date: 2024/5/20 22:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private Integer bookCode;
}
