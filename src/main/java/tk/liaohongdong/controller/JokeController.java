package tk.liaohongdong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tk.liaohongdong.app.JokeApp;

@Controller
@RequestMapping("/joke")
public class JokeController {

	@RequestMapping(value = "/methodOne", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String getRequest(@RequestParam String callback) {
		return callback + "(" + JokeApp.getRequest1() + ");";
	}
	
//	@RequestMapping(value = "/methodOne/{callback}", produces = "text/html;charset=utf-8")
//	@ResponseBody
//	public String getRequest(@PathVariable("callback") String callback) {
//		return callback + "(" + JokeApp.getRequest1() + ");";
//	}
}
