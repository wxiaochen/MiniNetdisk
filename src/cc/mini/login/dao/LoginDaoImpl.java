package cc.mini.login.dao;

import cc.mini.entity.User;
import cc.mini.framework.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.regex.Pattern;

/**
 * Created by dell-sun on 2017/2/12.
 */
@Repository
public class LoginDaoImpl extends BaseDao<User,Integer>{

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    public User findByNameAndPwd(String name, String password){
        try {
            //System.out.println("dao user and password"+name+password);
            //判断name是email还是usernamem
            if(this.isEmail(name))
            {
                return super.findOne("from User user where user.email=? and user.password=?", new Object[]{name,password});
            }else{
                //System.out.println("dao not email user and password"+name+password);
                return super.findOne("from User user where user.userName=? and user.password=?", new Object[]{name,password});
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
