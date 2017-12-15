package cc.xiaoerbi.service;

import cc.xiaoerbi.dao.UserMybitysDao;
import cc.xiaoerbi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    private UserMybitysDao userMybitysDao;

    public int addUser(User user) {
        return userMybitysDao.insert(user);
    }
}
