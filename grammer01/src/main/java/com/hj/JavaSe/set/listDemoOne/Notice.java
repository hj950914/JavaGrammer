package com.hj.JavaSe.set.listDemoOne;

import java.util.Date;

/**
 * Author: hj
 * Date: 2019-03-01 19:46
 * Description: <List简单案例使用,一共"公告类"定义>
 */
public class Notice {
    private int id;//ID
    private String title;//标题
    private String creator;//创建人
    private Date createTime;//创建时间

    public Notice() {

    }

    public Notice(int id, String title, String creator, Date createTime) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
