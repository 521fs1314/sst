package com.cxr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cxr.bean.PbAdminLog;
import com.cxr.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping()
	public String index() {
		
		return "index";
	}
			
	/*@RequestMapping("/loginss")*/
	@ResponseBody
	public List<PbAdminLog> logins() {
		PbAdminLog Log = new PbAdminLog();
		Log.setLogId(2);
		List<PbAdminLog> list = loginService.getListLog(Log);
		return list;
	}
	
	@RequestMapping("/")
	public String login() {
		PbAdminLog Log = new PbAdminLog();
		Log.setLogId(3);
		return "index";
	}
	

}
