package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Admin {
    @Id
    private Integer aid;

    @Column(name = "admin_name")
    private String adminName;

    private String password;

    public Admin() {
    }

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.password = adminPassword;
    }

    /**
     * @return aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * @param aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * @return admin_name
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}