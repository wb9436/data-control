package com.wubing.datacontrol.test.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: WB
 * @Date: 2018/8/15 13:55
 * @Description:
 */
public class UserAccountLogDto implements Serializable {

    private int id;
    private int userId;
    private int preModify;//修改前
    private int modify;//
    private int balance;//当前余额
    private Date modifyTime;//变更时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPreModify() {
        return preModify;
    }

    public void setPreModify(int preModify) {
        this.preModify = preModify;
    }

    public int getModify() {
        return modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
