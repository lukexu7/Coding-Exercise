package com.atguigu01.string.exe3;

/**
 * ClassName: User
 * Package: com.atguigu01.string.exe3
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/22 - 18:22
 * @Version: v1.0
 */


public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString(){
        return name + "-" + password;
    }
}
