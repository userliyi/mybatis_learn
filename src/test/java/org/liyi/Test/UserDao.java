package org.liyi.Test;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
   void insert(User user);
   User findUserById(int userId);
   List<User> findAllUsers();

   @Select("select * from user where age =#{age}")
   List<User> findByAge(@Param(value = "age")Integer age);
}
