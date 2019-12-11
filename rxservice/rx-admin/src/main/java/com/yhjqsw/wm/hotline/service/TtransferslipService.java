package com.yhjqsw.wm.hotline.service;

import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.core.service.CurdService;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.model.Ttransferslip;

import java.util.List;

/**
 * ---------------------------
 * 转办单表：存储转办单的基本信息。 (TtransferslipService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TtransferslipService extends CurdService<Ttransferslip> {
    Treceipt findByReceiptid(Ttransferslip ttransferslip);
    List<Ttransferslip> findAll();
    int updatestatus(Ttransferslip record);
    int findstatus(Ttransferslip record);
    List<Ttransferslip> findTraAndReceipt(String receiptcode);
    int iftransferslip(Ttransferslip record);
    List<Ttransferslip> nocheck();
}
