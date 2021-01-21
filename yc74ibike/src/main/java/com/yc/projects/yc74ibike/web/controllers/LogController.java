package com.yc.projects.yc74ibike.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.projects.yc74ibike.service.LogService;
import com.yc.projects.yc74ibike.web.model.JsonModel;

@Controller
public class LogController {
	@Autowired
	private LogService logService;
	
	@PostMapping(value="/log/savelog")
	@ResponseBody
	public JsonModel ready(JsonModel jsonModel,@RequestBody String log) {
		logService.save(log);
		jsonModel.setCode(1);
		return jsonModel;
	}
	
	
	@PostMapping(value="/log/addPayLog")
	@ResponseBody
	public JsonModel addPayLog(JsonModel jsonModel,@RequestBody String log) {
		logService.savePayLog(log);
		jsonModel.setCode(1);
		return jsonModel;
	}
	
	
	@PostMapping(value="/log/addRepairLog")
	@ResponseBody
	public JsonModel addRepairLog(JsonModel jsonModel,@RequestBody String log) {
		logService.addRepairLog(log);
		jsonModel.setCode(1);
		return jsonModel;
	}
	
	
	@PostMapping(value="/log/addRunLog")
	@ResponseBody
	public JsonModel addRunLog(JsonModel jsonModel,@RequestBody String log) {
		logService.addRunLog(log);
		jsonModel.setCode(1);
		return jsonModel;
	}
}
