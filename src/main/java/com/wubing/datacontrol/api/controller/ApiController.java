package com.wubing.datacontrol.api.controller;

import com.wubing.datacontrol.test.dto.UserDto;
import com.wubing.datacontrol.test.service.IUserService;
import com.wubing.datacontrol.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserInfo")
    Result getUser(@RequestBody ApiRequestDto request) {
        UserDto userDto = userService.getUserInfo(request.getUserId());
        return Result.ok().put("body", userDto);
    }

}
