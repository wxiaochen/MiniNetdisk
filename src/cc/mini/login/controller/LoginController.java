package cc.mini.login.controller;

import cc.mini.entity.User;
import cc.mini.login.service.LoginServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by dell-sun on 2017/2/12.
 */

@Controller
@RequestMapping("loginuser")
public class LoginController {

    @Resource
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("login")
    public String login(@RequestParam("username") String name, @RequestParam("password") String password,
                        HttpSession session, HttpServletResponse response){
        System.out.println("controller user and password"+name+password);
        User user = loginServiceImpl.login(name,password);

        if(user != null){
            session.setAttribute("user",user );
            session.setMaxInactiveInterval(7*24*60*60);
            return "redirect:/netdisk/list";
        } else {
            System.out.println("user is null");
            return "redirect:/static/login.jsp";
        }

    }
}
