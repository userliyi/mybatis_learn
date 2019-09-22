package org.liyi.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDaoTest {
  @Test
  public void finUserById() {
    SqlSession sqlSession = getSessionFactory().openSession();
    ArraycardMapper arraycardMapper = sqlSession.getMapper(ArraycardMapper.class);
    ArrayCardDto arrayCardDto = new ArrayCardDto();
    arrayCardDto.setId(1);
    arrayCardDto.setName("liyiwang");
    List<ArrayCardDto> arrayCardDto1 = arraycardMapper.selectByname(arrayCardDto.getId(),arrayCardDto.getName());
    assertEquals("liyiwang",arrayCardDto1.get(0).getName());
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
