package com.ix.api.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ix.core.base.RequestObj;
import com.ix.core.base.ResultObj;

@Controller
public class SysGatewayAction {
	
	@ResponseBody
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResultObj handle(@RequestBody RequestObj req) 
					throws Exception {
	
		System.out.println("adfasd");
		return null;
	}
	
}
