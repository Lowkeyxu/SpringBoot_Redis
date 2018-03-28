/*
 * @(#) Redis.java 2018/3/22
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.simpo.entity;

import javax.persistence.*;
import java.util.Date;

/** redis测试
 * @author xuwc
 * @version 1.0
 * @since 2018/3/22
 */
@Entity
@Table(name = "sys_redis")
public class Redis{

    //id
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    //标题
    @Column(name = "title")
    private String title;
    //排序
    @Column(name = "sort")
    private int sort;
    //添加时间
    @Column(name = "addtime")
    private Date addTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
