package com.JackGuo.Springcloud.common;

import com.JackGuo.Springcloud.common.exception.BussiException;
import lombok.Data;

/**
 * 业务结果包装类，用于对数据交互
 */

@Data
public class Result {

    //业务码
    private  Integer code;
    //业务消息
    private  String  msg;
    //业务数据
    private  Object  data;

//    业务分为两种情况：成功和失败
//    成功： 1成功了没有返回值    2成功了有返回值
//    失败： 失败没有数据，失败原因



//    成功没有数据
    public Result() {
        this.code = CodeMsg.SUCCESS.code;
        this.msg = CodeMsg.SUCCESS.msg;
    }


//    成功有数据

    public Result(Object data) {
        this.code = CodeMsg.SUCCESS.code;
        this.msg = CodeMsg.SUCCESS.msg;
        this.data = data;
    }


    //    失败有失败信息和错误码
    public Result(CodeMsg codeMsg){
        this.code=codeMsg.code;
        this.msg=codeMsg.msg;

    }

//    兼容异常信息，自定义异常类
    public Result(BussiException bussiException){
        this.code=bussiException.getCode();
        this.msg=bussiException.getMsg();
    }

}
