package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class BackController {

	
	
	//m_b_display.jsp    管理员后台首页展示
	@RequestMapping("/m_b_display")
	public String display() {
		return "manager/m_b_display";
	}
	
	//app_validate.jsp  管理员审核首页面
	@RequestMapping("/validate")
	public String validate() {
		return "manager/app_validate";
	}
	
	@RequestMapping("/v_display")
	public String v_display() {
		return "manager/m_app_v_display";
	}
	
	
}
