package com.wubing.datacontrol.test.controller;

import com.wubing.datacontrol.test.dto.UserDto;
import com.wubing.datacontrol.test.service.IUserService;
import com.wubing.datacontrol.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: WB
 * @Date: 2018/8/15 14:50
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/get")
    Result getUser(int userId, HttpServletRequest request) {
        UserDto userDto = userService.getUserInfo(userId);
        return Result.ok().put("userInfo", userDto);
    }

}
