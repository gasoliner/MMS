package cn.mms.mapper;

import cn.mms.po.Instore;
import cn.mms.po.InstoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InstoreMapper {
    long countByExample(InstoreExample example);

    int deleteByExample(InstoreExample example);

    int deleteByPrimaryKey(Integer isid);

    int insert(Instore record);

    int insertSelective(Instore record);

    List<Instore> selectByExample(InstoreExample example);

    Instore selectByPrimaryKey(Integer isid);

    int updateByExampleSelective(@Param("record") Instore record, @Param("example") InstoreExample example);

    int updateByExample(@Param("record") Instore record, @Param("example") InstoreExample example);

    int updateByPrimaryKeySelective(Instore record);

    int updateByPrimaryKey(Instore record);
}