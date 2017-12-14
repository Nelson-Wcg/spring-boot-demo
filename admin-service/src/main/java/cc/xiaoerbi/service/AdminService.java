package cc.xiaoerbi.service;

import cc.xiaoerbi.dao.UserDao;
import cc.xiaoerbi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.insert(user);
    }
}
