package com.ssm.po;

public class User {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return this.jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    

    @Override
    public String toString() {
        return "User {" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", jobs='" + getJobs() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }
    
}
