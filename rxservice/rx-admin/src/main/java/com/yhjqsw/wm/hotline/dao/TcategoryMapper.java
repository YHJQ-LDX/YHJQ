package com.yhjqsw.wm.hotline.dao;
import com.yhjqsw.wm.hotline.model.Tcategory;


import java.util.List;

/**
 * ---------------------------
 * 类别表：存储问题分类的基本信息。 (TcategoryMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface TcategoryMapper {

	/**
	 * 添加类别表：存储问题分类的基本信息。
	 * @param record
	 * @return
	 */
    int add(Tcategory record);

    /**
     * 删除类别表：存储问题分类的基本信息。
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改类别表：存储问题分类的基本信息。
     * @param record
     * @return
     */
    int update(Tcategory record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Tcategory findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Tcategory> findPage();
    List<Tcategory> findAll();

    List<Tcategory> findPageByCondition(String record);
    
}