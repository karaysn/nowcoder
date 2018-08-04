package com.nowcoder.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author liumeng
 * 2017/6/21.
 */
@Mapper
public interface TestDAO {
  String TABLE_NAME = "cts_interview_evaluation_reference";

  @Insert({"insert into ", TABLE_NAME, " (creator_id, reference, last_update, create_time)  values (#{creatorId}, #{reference} ,now(),now())"})
  void updateLikeCount(@Param("creatorId") int creatorId, @Param("reference") String reference);

}
