package cn.mms.mapper;

import cn.mms.po.Outstore;
import cn.mms.po.OutstoreExample;
import cn.mms.po.Page;
import cn.mms.po.VoOutstore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutstoreMapper {
    long countByExample(OutstoreExample example);

    int deleteByExample(OutstoreExample example);

    int deleteByPrimaryKey(Integer osid);

    int insert(Outstore record);

    int insertSelective(Outstore record);

    List<Outstore> selectByExample(OutstoreExample example);

    Outstore selectByPrimaryKey(Integer osid);

    int updateByExampleSelective(@Param("record") Outstore record, @Param("example") OutstoreExample example);

    int updateByExample(@Param("record") Outstore record, @Param("example") OutstoreExample example);

    int updateByPrimaryKeySelective(Outstore record);

    int updateByPrimaryKey(Outstore record);


    List<Outstore> selectAll(Page page);

    List<VoOutstore> selectBorrow(Page page);
}