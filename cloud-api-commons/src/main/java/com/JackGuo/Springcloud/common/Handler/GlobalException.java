package com.JackGuo.Springcloud.common.Handler;

import com.JackGuo.Springcloud.common.CodeMsg;
import com.JackGuo.Springcloud.common.Result;
import com.JackGuo.Springcloud.common.exception.BussiException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 * ControllerAdvice:作用
 * 全局异常处理
 * 全局数据绑定
 * 全局数据预处理
 */
@ControllerAdvice
public class GlobalException {

    @ResponseBody
    @ExceptionHandler //@ExceptionHandler统一抛出异常数据
    public Object handlerException(Exception exception) {
        exception.printStackTrace();
//        判断是否是我们自己定义的异常
        if (exception instanceof BussiException){
            BussiException bussiException=(BussiException) exception;
            return new Result(bussiException);
        }
//        不是我们的以后再补else

        return new Result(CodeMsg.ERROR);
    }
}
