package com.B0529002.bean;

import java.io.Serializable;

public class ClientUser implements Serializable{
    private String userName;//define username as userID
    private String status;//user status outLine, inLine
    private boolean notify;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public boolean isNotify() {
        return notify;
    }
    public void setNotify(boolean notify) {
        this.notify = notify;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
