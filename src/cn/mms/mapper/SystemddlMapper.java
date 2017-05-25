package cn.mms.mapper;

import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.po.SystemddlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemddlMapper {
    long countByExample(SystemddlExample example);

    int deleteByExample(SystemddlExample example);

    int deleteByPrimaryKey(Integer sysid);

    int insert(Systemddl record);

    int insertSelective(Systemddl record);

    List<Systemddl> selectByExample(SystemddlExample example);

    Systemddl selectByPrimaryKey(Integer sysid);

    int updateByExampleSelective(@Param("record") Systemddl record, @Param("example") SystemddlExample example);

    int updateByExample(@Param("record") Systemddl record, @Param("example") SystemddlExample example);

    int updateByPrimaryKeySelective(Systemddl record);

    int updateByPrimaryKey(Systemddl record);

    List<Systemddl> selectAllByKey(Page page);

}