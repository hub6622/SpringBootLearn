package ppg.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ppg.demo.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> findAll();
    void insertUser(User user);

    @Select("select * from t_user where id=#{id}")
    User findById(Integer id);

    List<User> findUserBook();
}
