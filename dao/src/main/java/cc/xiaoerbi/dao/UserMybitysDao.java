package cc.xiaoerbi.dao;

import cc.xiaoerbi.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMybitysDao {
    @Insert("INSERT INTO user(name,sex) VALUES(#{name}, #{sex})")
    int insert(User user);
}
