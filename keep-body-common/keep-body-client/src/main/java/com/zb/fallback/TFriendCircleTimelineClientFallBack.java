package com.zb.fallback;

import com.zb.pojo.TFriendCircleTimeline;

import com.zb.client.RestTFriendCircleTimelineClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class TFriendCircleTimelineClientFallBack implements RestTFriendCircleTimelineClient {


    @Override
    public TFriendCircleTimeline getTFriendCircleTimelineById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<TFriendCircleTimeline>	getTFriendCircleTimelineListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getTFriendCircleTimelineCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddTFriendCircleTimeline(TFriendCircleTimeline tFriendCircleTimeline)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyTFriendCircleTimeline(TFriendCircleTimeline tFriendCircleTimeline)throws Exception{
        return null;
    }
}
