package ppg.demo.service;

import ppg.demo.pojo.UserFile;

import java.util.List;

public interface FileService {
    boolean addFile(String fileName);
    List<UserFile> findAll();

    UserFile findById(Integer id);

    UserFile findByName(String originalFilename);
}
