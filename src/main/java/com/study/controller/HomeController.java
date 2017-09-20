package com.study.controller;

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
}
