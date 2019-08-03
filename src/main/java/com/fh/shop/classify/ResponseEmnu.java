package com.fh.shop.classify;

public enum ResponseEmnu implements IEmnu {
    ERROR(500,"error"),
    SUCCESS(200,"OK"),
    USERORPASSWORDNIL(1001,"用户名或密码为空"),
    PASSWORDERROR(1002,"密码不正确"),
    USERISNOT(1003,"error"),
    HANDLERINFOISNOT(1004,"头部信息不完整"),
    SIGNERROR(1005,"秘钥信息不完整"),
    PHONENUMBERISNULL(3001,"手机号为空"),
    PHONEISERROR(3000,"手机号不正确"),
    CODEISNULL(3002,"验证码不正确"),
    REGSUCCESS(200,"注册成功"),
    TIMEERROR(1007,"请求时间不匹配，请求已被拦截"),
    LOGINTIMEOUT(1005,"登录超时");


    private int code;
        private String msg;

        private ResponseEmnu(int code, String msg){
            this.code = code;
            this.msg = msg;
        }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
