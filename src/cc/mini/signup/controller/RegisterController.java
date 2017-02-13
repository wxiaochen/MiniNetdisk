package cc.mini.signup.controller;

import cc.mini.entity.User;
import cc.mini.signup.service.RegistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Jupiter on 2017/2/12.
 */
@Controller
public class RegisterController {

    @Resource
    private RegistService registService;

    @RequestMapping("regist")
    public String regist(User user){
        registService.save(user);
        return "/static/netdisk";
    }

}
