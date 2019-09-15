package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TFriendCircleMessage implements Serializable {
	//主键
	private Integer id;
	//用户id
	private Integer uid;
	//
	private String content;
	//图片
	private String picture;
	//位置
	private String location;
	//创建日期
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}