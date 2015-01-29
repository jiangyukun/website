package me.jiangyu.website.service.impl;

import me.jiangyu.website.dao.UserRepository;
import me.jiangyu.website.domain.User;
import me.jiangyu.website.service.UserService;
import me.jiangyu.website.util.DateUtil;
import me.jiangyu.website.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setRegistrationDate(DateUtil.getCurrentDateTimeString());
        user.setPassword(MD5Utils.md5(user.getPassword(), MD5Utils.Type.LOWER));
        userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findUserByMobile(String mobile) {
        return userRepository.findUserByMobile(mobile);
    }

    @Override
    public boolean login(String username, String password) {
        return userRepository.login(username, password) != null;
    }

    @Override
    public boolean loginByMobile(String mobile, String password) {
        return userRepository.loginByMobile(mobile, password) != null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(String id) {

    }
}
