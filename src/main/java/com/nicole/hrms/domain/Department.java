package com.nicole.hrms.domain;

import java.io.Serializable;

/**
 * Created by xl on 2017/6/22.
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;  // 部门编号
    private String name;  // 名称
    private String description;  // 描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Department:[id=" + id + ",name=" + name + ",description="
                + description + "]";
    }
}
