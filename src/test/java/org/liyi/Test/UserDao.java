package org.liyi.Test;

import java.util.List;

public interface UserDao {
   void insert(User user);
   User findUserById(int userId);
   List<User> findAllUsers();
}
