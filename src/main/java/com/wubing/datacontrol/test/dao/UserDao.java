package com.wubing.datacontrol.test.dao;

import com.wubing.datacontrol.test.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: WB
 * @Date: 2018/8/15 13:59
 * @Description:
 */
@Mapper
public interface UserDao {
    int insertUserDao(UserDto userDto);

    UserDto getUserDto(@Param("userId") int userId);

    int updateUserDto(UserDto userDto);
}
