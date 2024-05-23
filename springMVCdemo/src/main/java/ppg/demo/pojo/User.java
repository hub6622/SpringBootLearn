package ppg.demo.pojo;


import lombok.Data;

@Data
public class User {
    private String username;
    private String age;
    private String gender;
    private Address address;
}
