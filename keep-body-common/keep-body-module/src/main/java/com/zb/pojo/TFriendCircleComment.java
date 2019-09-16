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
    //内容
    private String content;
    //创建日期
    private String createTime;
    //是否删除
    private Integer isOwn;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getIsOwn() {
        return isOwn;
    }

    public void setIsOwn(Integer isOwn) {
        this.isOwn = isOwn;
    }
}
