package tk.liaohongdong.controller;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tk.liaohongdong.app.RobotApp;

@Controller
@RequestMapping("/robot")
public class RobotController {

	@RequestMapping(value = "/getOne", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String getRobot(@RequestParam String info, @RequestParam String callback) {
		// MappingJacksonValue mj = new MappingJacksonValue("test");
		// mj.setValue(value);
		// mj.setJsonpFunction(callback);
		return callback + "(" + RobotApp.getRequest1(info) + ");";
	}
}
