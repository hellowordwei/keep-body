package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TFriendCircleTimeline implements Serializable {
    //
    private Integer id;
    //用户id
    private Integer uid;
    //朋友圈信息id
    private Integer fcmid;
    //是否是自己的
    private Integer isOwn;
    //创建日期
    private String createTime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUid (Integer  uid){
        this.uid=uid;
    }
    public  Integer getUid(){
        return this.uid;
    }
    public void setFcmid (Integer  fcmid){
        this.fcmid=fcmid;
    }
    public  Integer getFcmid(){
        return this.fcmid;
    }
    public void setIsOwn (Integer  isOwn){
        this.isOwn=isOwn;
    }
    public  Integer getIsOwn(){
        return this.isOwn;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
