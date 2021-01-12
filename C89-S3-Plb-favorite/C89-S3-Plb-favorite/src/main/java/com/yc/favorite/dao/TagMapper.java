package com.yc.favorite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import com.yc.favorite.bean.Tag;

import org.apache.ibatis.annotations.Many;

public interface TagMapper {
	
	@Insert("insert into tag values (null, #{tname}, #{tcount})")
    @Options(useGeneratedKeys = true ,keyColumn = "tid",keyProperty = "tid")
	int insert(Tag tag);
	
    @Select("Select * from tag where tname=#{tname}") 
	Tag selectByName(String tname);
	
	@Update("update tag set tcount = tcount + 1 where tname = #{tname}")
	int updateCountByName(String tname);
	
	@Select("Select * from tag") 
	List<Tag> selectAll();

	@Select("select*from tag where tid=#{n}")
	// resultMap
	@Results({
		@Result(column = "tid",property="favorites",
					  many=@Many(
							  		select="com.yc.favorite.dao.FavoriteMapper.selectByTid",
							  		fetchType = FetchType.LAZY
					)
		)
	})
	Tag selectByTid(int tid);
}
