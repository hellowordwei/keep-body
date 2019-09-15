package com.zb.fallback;

import com.zb.pojo.TFriendCircleMessage;

import com.zb.client.RestTFriendCircleMessageClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class TFriendCircleMessageClientFallBack implements RestTFriendCircleMessageClient {


    @Override
    public TFriendCircleMessage getTFriendCircleMessageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<TFriendCircleMessage>	getTFriendCircleMessageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getTFriendCircleMessageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddTFriendCircleMessage(TFriendCircleMessage tFriendCircleMessage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyTFriendCircleMessage(TFriendCircleMessage tFriendCircleMessage)throws Exception{
        return null;
    }
}
