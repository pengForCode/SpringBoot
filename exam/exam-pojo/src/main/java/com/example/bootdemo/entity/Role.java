package com.example.bootdemo.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author Yu Peng
 * @Date 2019/11/27 11:38
 * @Version 1.0
 */
@Table(name = "t_role")
public class Role {
    @Id
    private Integer r_id;
    private String r_code;
    private String r_name;
    private String r_remark;
    private String r_status;
    private String r_version;
    private String r_created_by;
    private String r_updated_by;
    private Date r_created_time;
    private Date r_updated_time;

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_code() {
        return r_code;
    }

    public void setR_code(String r_code) {
        this.r_code = r_code;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_remark() {
        return r_remark;
    }

    public void setR_remark(String r_remark) {
        this.r_remark = r_remark;
    }

    public String getR_status() {
        return r_status;
    }

    public void setR_status(String r_status) {
        this.r_status = r_status;
    }

    public String getR_version() {
        return r_version;
    }

    public void setR_version(String r_version) {
        this.r_version = r_version;
    }

    public String getR_created_by() {
        return r_created_by;
    }

    public void setR_created_by(String r_created_by) {
        this.r_created_by = r_created_by;
    }

    public String getR_updated_by() {
        return r_updated_by;
    }

    public void setR_updated_by(String r_updated_by) {
        this.r_updated_by = r_updated_by;
    }

    public Date getR_created_time() {
        return r_created_time;
    }

    public void setR_created_time(Date r_created_time) {
        this.r_created_time = r_created_time;
    }

    public Date getR_updated_time() {
        return r_updated_time;
    }

    public void setR_updated_time(Date r_updated_time) {
        this.r_updated_time = r_updated_time;
    }
}
