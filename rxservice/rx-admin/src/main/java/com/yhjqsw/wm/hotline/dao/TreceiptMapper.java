package com.yhjqsw.wm.hotline.dao;


import com.yhjqsw.wm.hotline.model.Treceipt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ---------------------------
 * 接单表：存储接单表的基本信息。 (TreceiptMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TreceiptMapper {

	/**
	 * 添加接单表：存储接单表的基本信息。
	 * @param record
	 * @return
	 */
    int add(Treceipt record);

    /**
     * 删除接单表：存储接单表的基本信息。
     * @param receiptid
     * @return
     */
    int delete(Long receiptid);
    
    /**
     * 修改接单表：存储接单表的基本信息。
     * @param record
     * @return
     */
    int update(Treceipt record);
    
    /**
     * 根据主键查询
     * @param receiptid
     * @return
     */    
    Treceipt findById(Long receiptid);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Treceipt> findPage();
    List<Treceipt> findAll();
    List<Treceipt> findall(@Param(value="receiptcode") String receiptcode,
                           @Param(value="address") String address,
                           @Param(value="callertel") String callertel);

}