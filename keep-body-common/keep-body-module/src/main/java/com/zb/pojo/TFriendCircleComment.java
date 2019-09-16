package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TFriendCircleComment implements Serializable {
    //
    private String id;
    //朋友圈信息id
    private String fcmid;
    //用户id
    private String uid;
    //
    private String content;
    //创建日期
    private String createTime;
    //点赞数
    private Integer isOwn;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setFcmid (String  fcmid){
        this.fcmid=fcmid;
    }
    public  String getFcmid(){
        return this.fcmid;
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
    public void setCreateTime (String  createTime){
        this.createTime=createTime;
    }
    public  String getCreateTime(){
        return this.createTime;
    }
    public void setIsOwn (Integer  isOwn){
        this.isOwn=isOwn;
    }
    public  Integer getIsOwn(){
        return this.isOwn;
    }
}
