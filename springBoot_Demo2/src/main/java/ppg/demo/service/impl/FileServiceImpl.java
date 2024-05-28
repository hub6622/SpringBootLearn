package ppg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppg.demo.mapper.FileMapper;
import ppg.demo.pojo.UserFile;
import ppg.demo.service.FileService;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    FileMapper fileMapper;
    @Override
    public boolean addFile(String fileName) {
        return fileMapper.addFile(fileName);
    }

    @Override
    public List<UserFile> findAll() {
        return fileMapper.selectAll();
    }

    @Override
    public UserFile findById(Integer id) {
        return fileMapper.findById(id);
    }
}
