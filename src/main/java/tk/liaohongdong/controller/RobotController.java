package tk.liaohongdong.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
import tk.liaohongdong.app.RobotApp;

@Controller
@RequestMapping("/robot")
public class RobotController {

//	@CrossOrigin(origins = "*", maxAge = 3600)
//	@RequestMapping(value = "/getOne", produces = "text/html;charset=utf-8")
//	@ResponseBody
//	public String getRobot(@RequestParam String info, @RequestParam String callback) {
//		return callback + "(" + RobotApp.getRequest1(info) + ");";
//	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(value = "/getOne", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String getRobot(@RequestBody String info) { //@RequestParam @RequestBody
		Map<String, Object> map = null;
		JSONObject jsonObject = JSONObject.fromObject(info);
		map = (Map<String, Object>) JSONObject.toBean(jsonObject, Map.class);
		return RobotApp.getRequest1(map.get("info").toString()); //map.get("info").toString()
	}
}
