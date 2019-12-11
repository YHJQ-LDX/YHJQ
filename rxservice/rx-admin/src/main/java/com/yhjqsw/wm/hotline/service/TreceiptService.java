package com.yhjqsw.wm.hotline.service;


import com.yhjqsw.wm.core.service.CurdService;
import com.yhjqsw.wm.hotline.model.Treceipt;

import java.util.List;

/**
 * ---------------------------
 * 接单表：存储接单表的基本信息。 (TreceiptService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54x
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TreceiptService extends CurdService<Treceipt> {
    /**
     * 查询机构树
     * @param userId
     * @return
     */
    List<Treceipt> findTree();
//    List<Treceipt> findall(String receiptcode,String address);
    List<Treceipt> findall(String receiptcode,String address,String callertel);
}
