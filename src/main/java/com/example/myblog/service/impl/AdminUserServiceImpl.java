package com.example.myblog.service.impl;

import com.example.myblog.dao.AdminUserMapper;
import com.example.myblog.entity.AdminUser;
import com.example.myblog.service.AdminUserService;
import com.example.myblog.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }
}
