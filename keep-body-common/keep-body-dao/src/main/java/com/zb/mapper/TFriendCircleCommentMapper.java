package com.zb.mapper;
import com.zb.pojo.TFriendCircleComment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TFriendCircleCommentMapper {

	public TFriendCircleComment getTFriendCircleCommentById(@Param(value = "id") String id)throws Exception;

	public List<TFriendCircleComment>	getTFriendCircleCommentListByMap(Map<String,Object> param)throws Exception;

	public Integer getTFriendCircleCommentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTFriendCircleComment(TFriendCircleComment tFriendCircleComment)throws Exception;

	public Integer updateTFriendCircleComment(TFriendCircleComment tFriendCircleComment)throws Exception;


}
