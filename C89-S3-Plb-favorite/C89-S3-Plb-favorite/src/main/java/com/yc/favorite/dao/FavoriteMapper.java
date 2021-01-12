package com.yc.favorite.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.yc.favorite.bean.Favorite;

public interface FavoriteMapper {
	
	@Insert("insert into favorite values(null,#{flabel},#{furl},#{fdesc},#{ftags})")
	@Options(useGeneratedKeys = true ,keyColumn = "fid",keyProperty = "fid")
	int insert(Favorite f);

	@Select("Select * from favorite where label=#{tlabel}")
	Favorite selectByLabel(String tlabel);

	@Select("select a.* from favorite a"
				+" join tagfavorite b on a.fid=b.fid "
				+" where b.tid=#{tid}")
	List<Favorite>selectByTid(int tid);
	
	@Select("select*from favorite a"
				+ " where not exits (select*from tagfavorite b where a.fid=b.fid)")
	List<Favorite>selectNotTag();
}
