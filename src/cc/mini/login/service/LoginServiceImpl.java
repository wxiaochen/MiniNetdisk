package cc.mini.login.service;

import cc.mini.entity.User;
import cc.mini.login.dao.LoginDaoImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by dell-sun on 2017/2/12.
 */
@Service
@Transactional(readOnly = false)
public class LoginServiceImpl {

    @Resource
    private LoginDaoImpl loginDaoImpl;

    public User login(String name,String password){
        return this.loginDaoImpl.findByNameAndPwd(name,password);
    }
}
