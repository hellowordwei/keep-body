package com.zb.client;
import com.zb.pojo.TFriendCircleTimeline;

import com.zb.fallback.TFriendCircleTimelineClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "keep-friends-provider", fallback = TFriendCircleTimelineClientFallBack.class)
public interface RestTFriendCircleTimelineClient {
@RequestMapping(value = "/getTFriendCircleTimelineById",method = RequestMethod.POST)
public TFriendCircleTimeline getTFriendCircleTimelineById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getTFriendCircleTimelineListByMap",method = RequestMethod.POST)
public List<TFriendCircleTimeline>	getTFriendCircleTimelineListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getTFriendCircleTimelineCountByMap",method = RequestMethod.POST)
public Integer getTFriendCircleTimelineCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddTFriendCircleTimeline",method = RequestMethod.POST)
public Integer qdtxAddTFriendCircleTimeline(@RequestBody TFriendCircleTimeline tFriendCircleTimeline)throws Exception;

@RequestMapping(value = "/qdtxModifyTFriendCircleTimeline",method = RequestMethod.POST)
public Integer qdtxModifyTFriendCircleTimeline(@RequestBody TFriendCircleTimeline tFriendCircleTimeline)throws Exception;
}

