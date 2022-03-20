package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Math {
    @Id
    private Integer id;

    @Column(name = "admin_id")
    private Integer adminId;

    private Integer grate;

    public Math() {
    }

    public Math(Integer adminId, Integer grate) {
        this.adminId = adminId;
        this.grate = grate;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return admin_id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * @return grate
     */
    public Integer getGrate() {
        return grate;
    }

    /**
     * @param grate
     */
    public void setGrate(Integer grate) {
        this.grate = grate;
    }

    @Override
    public String toString() {
        return "Math{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", grate=" + grate +
                '}';
    }
}