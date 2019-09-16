package com.zb.fallback;

import com.zb.pojo.TFriendCircleComment;

import com.zb.client.RestTFriendCircleCommentClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class TFriendCircleCommentClientFallBack implements RestTFriendCircleCommentClient {


    @Override
    public TFriendCircleComment getTFriendCircleCommentById(String id)throws Exception{
        return null;
    }

    @Override
    public List<TFriendCircleComment>	getTFriendCircleCommentListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getTFriendCircleCommentCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddTFriendCircleComment(TFriendCircleComment tFriendCircleComment)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyTFriendCircleComment(TFriendCircleComment tFriendCircleComment)throws Exception{
        return null;
    }
}
