package com.yc.projects.yc74ibike.service;

public interface LogService {
	/**
	 * 保存操作日志
	 */
	public void save(String log);
	
	
	/**
	 * 充值日志
	 * @param log
	 */
	public void savePayLog(String log);
	
	
	/**
	 * 报修日志
	 * @param log
	 */
	public void addRepairLog(String log);
	
	/**
	 * 骑行日志
	 * @param log
	 */
	public void addRunLog(String log);
}
