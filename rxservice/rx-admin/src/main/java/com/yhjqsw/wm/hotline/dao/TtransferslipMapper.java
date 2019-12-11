package com.yhjqsw.wm.hotline.dao;

import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.core.page.PageResult;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.model.Ttransferslip;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * ---------------------------
 * 转办单表：存储转办单的基本信息。 (TtransferslipMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TtransferslipMapper {

	/**
	 * 添加转办单表：存储转办单的基本信息。
	 * @param record
	 * @return
	 */
    int add(Ttransferslip record);

    /**
     * 删除转办单表：存储转办单的基本信息。
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改转办单表：存储转办单的基本信息。
     * @param record
     * @return
     */
    int update(Ttransferslip record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Ttransferslip findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<Ttransferslip> findPage();
    List<Ttransferslip> findAll();
    int findviewtime(Long id);
    int findstatus(Long id);
    List<Ttransferslip> findTraAndReceipt(@Param(value="receiptcode") String receiptcode);
    int iftransferslip(Long id);
    List<Ttransferslip> nocheck();
}