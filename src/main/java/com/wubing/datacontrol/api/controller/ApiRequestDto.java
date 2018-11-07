package com.wubing.datacontrol.api.controller;

import java.io.Serializable;

public class ApiRequestDto implements Serializable {

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
