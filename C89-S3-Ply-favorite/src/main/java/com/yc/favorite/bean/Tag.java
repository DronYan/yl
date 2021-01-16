package com.yc.favorite.bean;

import java.util.List;

import lombok.Data;

@Data  // 自动的生成 get set toString 方法
public class Tag implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer tid;
	private String tname;
	private Long tcount;
	private List<Favorite> favorites;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Long getTcount() {
		return tcount;
	}
	public void setTcount(Long tcount) {
		this.tcount = tcount;
	}
	public List<Favorite> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
}
