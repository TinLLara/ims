package com.cxsl.ims.impl.dao;

import com.cxsl.ims.impl.entity.OaHolidayapply;
import com.cxsl.ims.impl.entity.OaHolidayapplyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaHolidayapplyMapper {
    int countByExample(OaHolidayapplyExample example);

    int deleteByExample(OaHolidayapplyExample example);

    int deleteByPrimaryKey(String happlyid);

    int insert(OaHolidayapply record);

    int insertSelective(OaHolidayapply record);

    List<OaHolidayapply> selectByExample(OaHolidayapplyExample example);

    OaHolidayapply selectByPrimaryKey(String happlyid);

    int updateByExampleSelective(@Param("record") OaHolidayapply record, @Param("example") OaHolidayapplyExample example);

    int updateByExample(@Param("record") OaHolidayapply record, @Param("example") OaHolidayapplyExample example);

    int updateByPrimaryKeySelective(OaHolidayapply record);

    int updateByPrimaryKey(OaHolidayapply record);
}