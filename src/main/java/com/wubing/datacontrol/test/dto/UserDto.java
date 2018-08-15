package com.wubing.datacontrol.test.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: WB
 * @Date: 2018/8/15 13:55
 * @Description:
 */
public class UserDto implements Serializable {

    private int userId;
    private String nickname;
    private int balance;
    private Date createTime;
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", nickname='" + nickname + '\'' +
                ", balance=" + balance +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
