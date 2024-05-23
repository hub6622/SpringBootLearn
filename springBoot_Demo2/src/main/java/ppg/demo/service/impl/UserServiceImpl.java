package ppg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppg.demo.mapper.UserMapper;
import ppg.demo.pojo.User;
import ppg.demo.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findUserBook() {
        return userMapper.findUserBook();
    }
}
