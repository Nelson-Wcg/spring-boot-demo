package cc.xiaoerbi.dao;

import cc.xiaoerbi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserHibernateDao extends CrudRepository<User, Integer> {
}
