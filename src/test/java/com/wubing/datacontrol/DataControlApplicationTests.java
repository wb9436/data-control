package com.wubing.datacontrol;

import com.wubing.datacontrol.test.dao.UserAccountLogDao;
import com.wubing.datacontrol.test.dao.UserDao;
import com.wubing.datacontrol.test.dto.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataControlApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserAccountLogDao userAccountLogDao;

    @Test
    public void contextLoads() {
        UserDto userDto = userDao.getUserDto(100000);
        if(userDto != null){
            int modify = 5;
            userDto.setBalance(userDto.getBalance());
            int result = userDao.updateUserDto(userDto);
            System.out.println("受影响的行数: " + result);

            System.out.println(userDto.toString());
        }
    }

}
