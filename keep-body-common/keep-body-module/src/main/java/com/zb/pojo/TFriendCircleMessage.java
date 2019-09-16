package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TFriendCircleMessage implements Serializable {
    //主键
    private String id;
    //用户id
    private String uid;
    //
    private String content;
    //图片
    private String picture;
    //位置
    private Integer isOwn;
    //创建日期
    private String createTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setUid (String  uid){
        this.uid=uid;
    }
    public  String getUid(){
        return this.uid;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setPicture (String  picture){
        this.picture=picture;
    }
    public  String getPicture(){
        return this.picture;
    }
    public void setIsOwn (Integer  isOwn){
        this.isOwn=isOwn;
    }
    public  Integer getIsOwn(){
        return this.isOwn;
    }
    public void setCreateTime (String  createTime){
        this.createTime=createTime;
    }
    public  String getCreateTime(){
        return this.createTime;
    }
}
