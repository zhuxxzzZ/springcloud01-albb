package com.JackGuo.Springcloud.common;


/**
 * 消息枚举类，用来声明消息类型
 */
public enum CodeMsg {

    SUCCESS(200,"操作成功"),
    ERROR(500,"数据内部错误"),
    INSERT_ERROR(501, "数据已经存在");

    public Integer code; //业务码
    public String msg; //业务消息


        CodeMsg(Integer code,String msg){
            this.code=code;
            this.msg=msg;

        }
}
