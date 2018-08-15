package com.wubing.datacontrol.test.service.impl;

import com.wubing.datacontrol.test.dao.UserDao;
import com.wubing.datacontrol.test.dto.UserDto;
import com.wubing.datacontrol.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: WB
 * @Date: 2018/8/15 14:52
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto getUserInfo(int userId) {
        return userDao.getUserDto(userId);
    }
}
