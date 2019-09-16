package com.zb.client;
import com.zb.pojo.TFriendCircleComment;

import com.zb.fallback.TFriendCircleCommentClientFallBack;
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
@FeignClient(name = "keep-friends-provider", fallback = TFriendCircleCommentClientFallBack.class)
public interface RestTFriendCircleCommentClient {
@RequestMapping(value = "/getTFriendCircleCommentById",method = RequestMethod.POST)
public TFriendCircleComment getTFriendCircleCommentById(@RequestParam("id") String id)throws Exception;

@RequestMapping(value = "/getTFriendCircleCommentListByMap",method = RequestMethod.POST)
public List<TFriendCircleComment>	getTFriendCircleCommentListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getTFriendCircleCommentCountByMap",method = RequestMethod.POST)
public Integer getTFriendCircleCommentCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddTFriendCircleComment",method = RequestMethod.POST)
public Integer qdtxAddTFriendCircleComment(@RequestBody TFriendCircleComment tFriendCircleComment)throws Exception;

@RequestMapping(value = "/qdtxModifyTFriendCircleComment",method = RequestMethod.POST)
public Integer qdtxModifyTFriendCircleComment(@RequestBody TFriendCircleComment tFriendCircleComment)throws Exception;
}

