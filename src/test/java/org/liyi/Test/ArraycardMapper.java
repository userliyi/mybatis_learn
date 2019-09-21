package org.liyi.Test;

import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface ArraycardMapper {
    long countByExample(ArraycardExample example);

    int deleteByExample(ArraycardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Arraycard record);

    int insertSelective(Arraycard record);

    List<Arraycard> selectByExample(ArraycardExample example);

    Arraycard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Arraycard record, @Param("example") ArraycardExample example);

    int updateByExample(@Param("record") Arraycard record, @Param("example") ArraycardExample example);

    int updateByPrimaryKeySelective(Arraycard record);

    int updateByPrimaryKey(Arraycard record);
}
