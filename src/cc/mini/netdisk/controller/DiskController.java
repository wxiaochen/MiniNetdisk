package cc.mini.netdisk.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import cc.mini.entity.Filestatus;
import cc.mini.netdisk.service.DiskService;

@Controller
@RequestMapping("/netdisk")
public class DiskController {
	
	@Resource
	private DiskService diskService; 
	
	@RequestMapping("/list")
	public String ListFiles(HttpSession session) throws Exception{
		
		List<Filestatus> fsList = null;
		
//		if(session !=null){
//			User loginUser = (User)session.getAttribute("LoginUser");
//			fsList = diskService.findRootFilesByUserId(loginUser.getId());
//		}
		
		fsList = diskService.findRootFilesByUserId(new Integer(1));
//		return new ModelAndView("redirect:/static/netdisk","fsList",fsList);
		return this.toIndex();
	}
	
	@RequestMapping("index")
	public String toIndex(){
		
		return "/static/netdisk";
	}

}
