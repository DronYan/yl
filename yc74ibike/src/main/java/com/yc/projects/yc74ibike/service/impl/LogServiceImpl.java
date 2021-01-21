package com.yc.projects.yc74ibike.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.yc.projects.yc74ibike.service.LogService;
@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(String log) {
		mongoTemplate.save(log,"logs");

	}

	@Override
	public void savePayLog(String log) {
		mongoTemplate.save(log,"payLog");
		
	}

	@Override
	public void addRepairLog(String log) {
		mongoTemplate.save(log,"addRepairLog");
		
	}

	@Override
	public void addRunLog(String log) {
		mongoTemplate.save(log,"addRunLog");
		
	}

}
