package com.example.myblog.service;

import com.example.myblog.entity.AdminUser;

public interface AdminUserService {

    AdminUser login(String userName, String password);

}