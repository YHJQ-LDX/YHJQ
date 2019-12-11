package com.yhjqsw.wm.hotline.controller;

import java.util.List;

import com.yhjqsw.wm.core.http.HttpResult;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.hotline.model.Tcategory;
import com.yhjqsw.wm.hotline.service.TcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
/**
 * ---------------------------
 * 类别表：存储问题分类的基本信息。 (TcategoryController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("category")
public class TcategoryController {

	@Autowired
	private TcategoryService tcategoryService;
	private static Logger logger =Logger.getLogger(TcategoryController.class);
	/**
	 * 保存类别表：存储问题分类的基本信息。
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Tcategory record) {
		try {
			return HttpResult.ok(tcategoryService.save(record));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("问题分类save方法报错，请联系系统开发人员！");
		}
	}

    /**
     * 删除类别表：存储问题分类的基本信息。
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Tcategory> records) {
		try {
			return HttpResult.ok(tcategoryService.delete(records));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("问题分类delete方法报错，请联系系统开发人员！");
		}
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		try {
			return HttpResult.ok(tcategoryService.findPage(pageRequest));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("问题分类findPage方法报错，请联系系统开发人员！");
		}
	}

	/**
	 * 查询所有的数据
	 * @return
	 */
	@PostMapping(value="/findAll")
	public HttpResult findAll() {
		try{
			return HttpResult.ok(tcategoryService.findAll());
		}catch (Exception e){
			logger.error(e.getMessage());
			return HttpResult.error("问题分类findAll方法报错，请联系系统开发人员！");
		}

	}
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		try{
			return HttpResult.ok(tcategoryService.findById(id));
		}catch (Exception e){
			logger.error(e.getMessage());
			return HttpResult.error("问题分类findById方法报错，请联系系统开发人员！");
		}
	}

}
