package org.liyi.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDaoTest {
  @Test
  public void finUserById() {
    SqlSession sqlSession = getSessionFactory().openSession();
    UserDao userMapper = sqlSession.getMapper(UserDao.class);
    List<User> user = userMapper.findAllUsers();
  }

  private static SqlSessionFactory getSessionFactory() {
    SqlSessionFactory sessionFactory = null;
    String resource = "configuration.xml";
    try {
      sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
    }catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
    return sessionFactory;
  }
}
