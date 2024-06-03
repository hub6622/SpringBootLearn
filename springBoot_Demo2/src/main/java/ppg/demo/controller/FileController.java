package ppg.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import ppg.demo.pojo.Result;
import ppg.demo.pojo.UserFile;
import ppg.demo.service.FileService;
import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    FileService fileService;
//    设置文件存放地址
    private static final String FILE_PATH = "D:\\filefafa\\";
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file) throws IOException {
        UserFile u = fileService.findByName(file.getOriginalFilename());
        if(u==null){
            File file1 = new File(FILE_PATH+file.getOriginalFilename());
            file.transferTo(file1);
            fileService.addFile(file.getOriginalFilename());
            return new Result("1","上传成功",file.getOriginalFilename());
        }
        return new Result("1","上传失败，已有该文件",file.getOriginalFilename());
    }
    @GetMapping("/download")
    public ModelAndView fileDownLoad(){
        List<UserFile> files = fileService.findAll(); // 获取文件列表
        System.out.println(files);
        ModelAndView modelAndView = new ModelAndView("fileDownloads"); // 指定视图名称
        modelAndView.addObject("files", files); // 将文件列表添加到模型中
        return modelAndView;
    }
    @GetMapping("/downloadFile/{id}")
    public String fileDownLoad(HttpServletResponse response,@PathVariable Integer id){
        String fileName = fileService.findById(id).getFileName();
        File file = new File(FILE_PATH +'/'+ fileName);
        if(!file.exists()){
            return "下载文件不存在";
        }
        // 重置响应，设置响应类型为二进制流，设置字符编码和文件长度
        response.reset();
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        // 设置响应头
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName );

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os  = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "下载失败";
        }
        return "下载成功";
    }
}

