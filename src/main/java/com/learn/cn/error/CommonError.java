package com.learn.cn.error;

public interface CommonError {

     int getErrCode();

     String getErrMsg();

     CommonError setErrMsg(String errMsg);
}
