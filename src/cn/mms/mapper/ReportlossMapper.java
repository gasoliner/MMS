package cn.mms.mapper;

import cn.mms.po.Page;
import cn.mms.po.Reportloss;
import cn.mms.po.ReportlossExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportlossMapper {
    long countByExample(ReportlossExample example);

    int deleteByExample(ReportlossExample example);

    int deleteByPrimaryKey(Integer rlid);

    int insert(Reportloss record);

    int insertSelective(Reportloss record);

    List<Reportloss> selectByExample(ReportlossExample example);

    Reportloss selectByPrimaryKey(Integer rlid);

    int updateByExampleSelective(@Param("record") Reportloss record, @Param("example") ReportlossExample example);

    int updateByExample(@Param("record") Reportloss record, @Param("example") ReportlossExample example);

    int updateByPrimaryKeySelective(Reportloss record);

    int updateByPrimaryKey(Reportloss record);

    List<Reportloss> selectAll(Page page);
}