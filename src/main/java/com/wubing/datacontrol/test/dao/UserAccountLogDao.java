package com.wubing.datacontrol.test.dao;

import com.wubing.datacontrol.test.dto.UserAccountLogDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: WB
 * @Date: 2018/8/15 13:59
 * @Description:
 */
@Mapper
public interface UserAccountLogDao {
    int insertUserAccountLogDao(UserAccountLogDto userAccountLogDto);

}
