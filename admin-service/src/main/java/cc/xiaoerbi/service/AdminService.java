package cc.xiaoerbi.service;

import cc.xiaoerbi.dao.UserMybitysDao;
import cc.xiaoerbi.dao.UserHibernateDao;
import cc.xiaoerbi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private UserMybitysDao userMybitysDao;
    private UserHibernateDao userHibernateDao;

    @Autowired
    public AdminService(UserHibernateDao userHibernateDao, UserMybitysDao userMybitysDao) {
        this.userHibernateDao = userHibernateDao;
        this.userMybitysDao = userMybitysDao;
    }

    public int addUser(User user) {
        return userMybitysDao.insert(user);
    }

    public User getUser(int id) {
        return userHibernateDao.findOne(id);
    }
}
