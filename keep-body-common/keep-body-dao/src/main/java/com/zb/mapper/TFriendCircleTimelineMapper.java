package com.zb.mapper;
import com.zb.pojo.TFriendCircleTimeline;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TFriendCircleTimelineMapper {

	public TFriendCircleTimeline getTFriendCircleTimelineById(@Param(value = "id") Long id)throws Exception;

	public List<TFriendCircleTimeline>	getTFriendCircleTimelineListByMap(Map<String,Object> param)throws Exception;

	public Integer getTFriendCircleTimelineCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTFriendCircleTimeline(TFriendCircleTimeline tFriendCircleTimeline)throws Exception;

	public Integer updateTFriendCircleTimeline(TFriendCircleTimeline tFriendCircleTimeline)throws Exception;


}
