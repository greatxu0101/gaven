package com.greatxu.gaven.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greatxu.gaven.service.util.TimeUtil;

@Controller
@RequestMapping("/util")
public class UtilController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(Map<String, Object> map) {
		map.put("name", "hello");
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "/{methodName}", method = RequestMethod.GET)	
	public Object getJson(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		String url = request.getRequestURI();
		
		String value = null;
		if (url != null && url.length() > 1 && url.indexOf("util") != -1) {
			value = url.substring(url.indexOf("util") + 5, url.length());
		}
		map.put("methodName", value);
		map.put("currentTime", TimeUtil.getCurrentTimeString());
		
		return map;
	}
}
