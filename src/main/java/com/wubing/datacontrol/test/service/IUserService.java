package com.wubing.datacontrol.test.service;

import com.wubing.datacontrol.test.dto.UserDto;

/**
 * @Auther: WB
 * @Date: 2018/8/15 14:51
 * @Description:
 */
public interface IUserService {
    UserDto getUserInfo(int userId);
}
