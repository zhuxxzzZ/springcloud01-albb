package com.JackGuo.Springcloud.common.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 自定义业务异常类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BussiException extends RuntimeException{
    private Integer code;
    private String msg;
}
