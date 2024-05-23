package ppg.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookId;
    private String bookName;
    private String bookCode;
    private String bookAuthor;
}
