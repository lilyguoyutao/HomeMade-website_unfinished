package com.myweb.homemade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.homemade.dao.UserDao;

@Service
public class UserService {
    @Autowired
	UserDao userdao;
}
