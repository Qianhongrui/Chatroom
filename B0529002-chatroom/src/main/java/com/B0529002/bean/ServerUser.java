package com.B0529002.bean;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ServerUser {
    private String userName;// define username as userID
    private String status; //user status outLine, inLine
    public Queue<String> session; //user message queue
    public String password;
    public int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public ServerUser(int id,String userName,String password) {
        super();
        this.userName = userName;
        this.id = id;
        this.password = password;
        //Ensure thread concurrent security
        session = new ConcurrentLinkedQueue();
    }
    public ServerUser() {
        super();
        new ServerUser(0, null,null);
    }
    public void addMsg(String message) {
        session.offer(message);
    }
    public String getMsg() {
        if (session.isEmpty())
            return null;
        return session.poll();
    }

}
