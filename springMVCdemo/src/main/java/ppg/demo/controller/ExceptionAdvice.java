package ppg.demo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ppg.demo.ExceptionAdvice.BusinessException;
import ppg.demo.ExceptionAdvice.SystemException;
import ppg.demo.pojo.Result;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result handleException(Exception e){
        System.out.println("异常捕获到了。。。。。");
        return new Result("201201",e.getMessage(),null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result handleException1(Exception e){
        System.out.println("异常捕获到了。。。。。");
        return new Result("201201",e.getMessage(),null);
    }
    @ExceptionHandler(Exception.class)
    public Result handleException2(Exception e){
        System.out.println("异常捕获到了。。。。。");
        return new Result("201201",e.getMessage(),null);
    }


}
