package com.cxsl.ims.impl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cxsl.ims.impl.entity.FInvoiceBill;
import com.cxsl.ims.impl.entity.FInvoiceBillExample;

public interface FInvoiceBillMapper {
    int countByExample(FInvoiceBillExample example);

    int deleteByExample(FInvoiceBillExample example);

    int deleteByPrimaryKey(Long invBillId);

    int insert(FInvoiceBill record);

    int insertSelective(FInvoiceBill record);

    List<FInvoiceBill> selectByExample(FInvoiceBillExample example);

    FInvoiceBill selectByPrimaryKey(Long invBillId);

    int updateByExampleSelective(@Param("record") FInvoiceBill record, @Param("example") FInvoiceBillExample example);

    int updateByExample(@Param("record") FInvoiceBill record, @Param("example") FInvoiceBillExample example);

    int updateByPrimaryKeySelective(FInvoiceBill record);

    int updateByPrimaryKey(FInvoiceBill record);
}