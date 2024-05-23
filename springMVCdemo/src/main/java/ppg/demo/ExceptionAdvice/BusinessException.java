package ppg.demo.ExceptionAdvice;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        System.out.println("异常"+message);
    }
}
