package ppg.demo.service;

import ppg.demo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findUserBook();
}
