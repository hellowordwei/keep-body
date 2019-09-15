package com.zb.client;
import com.zb.pojo.TFriendCircleMessage;

import com.zb.fallback.TFriendCircleMessageClientFallBack;
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
@FeignClient(name = "keep-friends-provider", fallback = TFriendCircleMessageClientFallBack.class)
public interface RestTFriendCircleMessageClient {
@RequestMapping(value = "/getTFriendCircleMessageById",method = RequestMethod.POST)
public TFriendCircleMessage getTFriendCircleMessageById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getTFriendCircleMessageListByMap",method = RequestMethod.POST)
public List<TFriendCircleMessage>	getTFriendCircleMessageListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getTFriendCircleMessageCountByMap",method = RequestMethod.POST)
public Integer getTFriendCircleMessageCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddTFriendCircleMessage",method = RequestMethod.POST)
public Integer qdtxAddTFriendCircleMessage(@RequestBody TFriendCircleMessage tFriendCircleMessage)throws Exception;

@RequestMapping(value = "/qdtxModifyTFriendCircleMessage",method = RequestMethod.POST)
public Integer qdtxModifyTFriendCircleMessage(@RequestBody TFriendCircleMessage tFriendCircleMessage)throws Exception;
}

