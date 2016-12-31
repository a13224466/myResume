package tk.liaohongdong.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tk.liaohongdong.pojo.TAdmin;
import tk.liaohongdong.service.TAdminService;

//@Controller
//@RequestMapping("/admin")
public class TAdminController {

	//@Autowired
	//private TAdminService tAdminService;
	
	//@RequestMapping("/selectAll")
	//public String selectTadminAll(Model model){
		//List<TAdmin> all = tAdminService.selectTadminAll();
		//model.addAttribute("all", all);
		//return "index";
	//}

//	@RequestMapping(value = "/findById")
//	public String findById(@RequestParam("id") int id, Model model) {
//		TAdmin admin = tAdminService.selectTadminAll(id);
//		System.out.println(admin.getName() + " " + admin.getPwd());
//		model.addAttribute("admin", admin);
//		return "index";
//	}
//
//	@RequestMapping(value = "/findByIdPath/{id}")
//	public String findByIdPath(@PathVariable("id") int id, Map<String, Object> model) {
//		TAdmin admin = tAdminService.findById(id);
//		System.out.println(admin.getName() + " " + admin.getPwd());
//		model.put("admin", admin);
//		return "index";
//	}
//
//	@RequestMapping(value = "/find/{id}")
//	@ResponseBody
//	public TAdmin find(@PathVariable("id") int id) {
//		TAdmin admin = tAdminService.findById(id);
//		return admin;
//	}
//
//	@RequestMapping(value = "/upload", method = RequestMethod.POST)
//	public String showUploadPage(@RequestParam("file") MultipartFile file) {
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.isEmpty());
//		System.out.println(file.getClass());
//		try {
//			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\Users\\Liao Hongdong\\Desktop",
//					System.currentTimeMillis() + file.getOriginalFilename()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "success";
//	}
//
//	@RequestMapping(value = "/login")
//	public String login(String name, String pwd) {
//		System.out.println(name + " " + pwd);
//		return "success";
//	}
}
