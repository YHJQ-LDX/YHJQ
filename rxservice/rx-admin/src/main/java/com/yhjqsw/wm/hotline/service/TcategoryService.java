package com.yhjqsw.wm.hotline.service;

import com.yhjqsw.wm.core.service.CurdService;
import com.yhjqsw.wm.hotline.model.Tcategory;

import java.util.List;

/**
 * ---------------------------
 * 类别表：存储问题分类的基本信息。 (TcategoryService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TcategoryService extends CurdService<Tcategory> {
    List<Tcategory> findAll();
}
