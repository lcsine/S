package com.ydlclass.handler;

import com.ydlclass.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局的异常处理
 * @author tang
 * {@code @date} 2023/11/07
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    public String processArithmeticException(ArithmeticException e){
        log.error("发生了数学类的异常",e);
        return "error";
    }
    @ExceptionHandler(BusinessException.class)
    public String processBusinessException(BusinessException e){
        log.error("发生了业务相关的异常",e);
        return "error";
    }
    @ExceptionHandler(Exception.class)
    public String processException(Exception e){
        log.error("发生了其他的异常",e);
        return "error";
    }
}
