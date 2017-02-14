package cc.mini.signup.service;

import cc.mini.entity.User;
import cc.mini.framework.BaseDao;
import cc.mini.signup.dao.RegistDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by Jupiter on 2017/2/12.
 */
@Service("registService")
public class RegistServiceImpl implements RegistService {

    @Resource
    private RegistDao registDao;


    @Override
    public void save(User user) {
        registDao.save(user);
    }
}
