package ppg.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ppg.demo.pojo.Result;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file) throws IOException {
        String filePath = "D:\\";
        File file1 = new File(filePath+file.getOriginalFilename());
        file.transferTo(file1);
        return new Result("1","上传成功",null);
    }
}

