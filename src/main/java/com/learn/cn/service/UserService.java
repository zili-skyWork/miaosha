package com.learn.cn.service;

import com.learn.cn.error.BusinessException;
import com.learn.cn.service.model.UserModel;

/**
 * @author czj
 */
public interface UserService {

    /**
     * 通过用户id获取对象
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;

}
