package com.yc.favorite.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TagFavoriteMapper {
	
	@Insert("insert into tagfavorite values(#{tid},#{fid})")
	int insert(@Param("tid")Integer tid,@Param("fid")Integer fid);
	
	@Select("select count(#{fid}) from tagfavorite) ")
	int countByFid(@Param("fid")Integer fid);

}
