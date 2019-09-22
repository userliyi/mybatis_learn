package org.liyi.Test;

import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface ArraycardMapper {
    long countByExample(ArraycardExample example);

    List<ArrayCardDto> selectByname(Integer id,String name);

    int deleteByExample(ArraycardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Arraycard record);

    int insertSelective(Arraycard record);

    List<ArrayCardDto> selectByExample(ArraycardExample example);

    ArrayCardDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Arraycard record, @Param("example") ArraycardExample example);

    int updateByExample(@Param("record") Arraycard record, @Param("example") ArraycardExample example);

    int updateByPrimaryKeySelective(Arraycard record);

    int updateByPrimaryKey(Arraycard record);
}
