package com.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class HomeController {

	@RequestMapping("/test")
	public JSONObject testJsonArray() {
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("大黄","喵喵");
		jsonArray.add(jsonObject1);
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("小花", "咪咪");
		jsonArray.add(jsonObject2);
		jsonObject.put("abc", jsonArray);
		return jsonObject;
	}
	
	@PostMapping("/sendJson")
	public Object sendJson(@RequestBody String jsonStr) {
		JSONObject fromObject = JSONObject.fromObject(jsonStr);
		return fromObject;
	}
	
	@PostMapping("/sendJsonWait")
	public Object sendJsonWait(@RequestBody String jsonStr) throws InterruptedException {
		JSONObject fromObject = JSONObject.fromObject(jsonStr);
		//Thread.sleep(20*1000);
		return fromObject;
	}
}
