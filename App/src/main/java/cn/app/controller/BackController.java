package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class BackController {

	
	
	//m_b_display.jsp    ����Ա��̨��ҳչʾ
	@RequestMapping("/m_b_display")
	public String display() {
		return "manager/m_b_display";
	}
	
	//app_validate.jsp  ����Ա�����ҳ��
	@RequestMapping("/validate")
	public String validate() {
		return "manager/app_validate";
	}
	
	@RequestMapping("/v_display")
	public String v_display() {
		return "manager/m_app_v_display";
	}
	
	
}
