package com.zb.mapper;
import com.zb.pojo.TFriendCircleMessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TFriendCircleMessageMapper {

	public TFriendCircleMessage getTFriendCircleMessageById(@Param(value = "id") Integer id)throws Exception;

	public List<TFriendCircleMessage>	getTFriendCircleMessageListByMap(Map<String,Object> param)throws Exception;

	public Integer getTFriendCircleMessageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTFriendCircleMessage(TFriendCircleMessage tFriendCircleMessage)throws Exception;

	public Integer updateTFriendCircleMessage(TFriendCircleMessage tFriendCircleMessage)throws Exception;

	public Integer deleteTFriendCircleMessage(@Param("id")Integer id)throws Exception;
}
