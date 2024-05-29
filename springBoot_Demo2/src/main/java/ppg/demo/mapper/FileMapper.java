package ppg.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ppg.demo.pojo.UserFile;

import java.util.List;

@Mapper
public interface FileMapper {
    @Insert("insert into t_file(file_name) values(#{fileName})")
    boolean addFile(String fileName);

    @Select("select * from t_file")
    List<UserFile> selectAll();

    @Select("select * from t_file where id = #{id}")
    UserFile findById(Integer id);
    @Select("select * from t_file where file_name = #{fileName}")
    UserFile findByName(String fileName);
}
