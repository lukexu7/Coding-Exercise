package com.ssm.assemble;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<String> list;
    
    public User(String userName, String password, List<String> list){
        super();
        this.userName = userName;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "{" +
            " userName='" + userName + "'" +
            ", password='" + password + "'" +
            ", list='" + list + "'" +
            "}";
    }
    
    public User(){
        
    };
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setList(List<String> list){
        this.list=list;
    }}
    
    
