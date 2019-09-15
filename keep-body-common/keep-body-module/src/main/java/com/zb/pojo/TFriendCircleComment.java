package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TFriendCircleComment implements Serializable {
    //
    private Integer id;
    //朋友圈信息id
    private Integer fcmid;
    //用户id
    private Integer uid;
    //
    private String content;
    //创建日期
    private Date createTime;
    //点赞数
    private Integer likeCount;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setFcmid (Integer  fcmid){
        this.fcmid=fcmid;
    }
    public  Integer getFcmid(){
        return this.fcmid;
    }
    public void setUid (Integer  uid){
        this.uid=uid;
    }
    public  Integer getUid(){
        return this.uid;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setLikeCount (Integer  likeCount){
        this.likeCount=likeCount;
    }
    public  Integer getLikeCount(){
        return this.likeCount;
    }
}
