package com.yhjqsw.wm.hotline.controller;

import java.util.List;

import com.yhjqsw.wm.core.http.HttpResult;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.hotline.dao.TtransferslipMapper;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.model.Ttransferslip;
import com.yhjqsw.wm.hotline.service.TreceiptService;
import com.yhjqsw.wm.hotline.service.TtransferslipService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ---------------------------
 * 接单表：存储接单表的基本信息。 (TreceiptController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("treceipt")
public class TreceiptController {

	@Autowired
	private TreceiptService treceiptService;
	@Autowired
	private TtransferslipService ttransferslipService;
	private static Logger logger =Logger.getLogger(TcategoryController.class);

	/**
	 * 保存接单表：存储接单表的基本信息。
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Treceipt record) {
		try {
			return HttpResult.ok(treceiptService.save(record));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("接单表save方法报错，请联系系统开发人员！");
		}
	}

    /**
     * 删除接单表：存储接单表的基本信息。
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Treceipt> records) {
		try {
			return HttpResult.ok(treceiptService.delete(records));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("接单表delete方法报错，请联系系统开发人员！");
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
			return HttpResult.ok(treceiptService.findPage(pageRequest));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("接单表findPage方法报错，请联系系统开发人员！");
		}
	}
	

	/**
	 * 根据主键查询
	 * @param
	 * @return
	 */

	@GetMapping(value="/findTree")
	public HttpResult findTree() {
		try {
			return HttpResult.ok(treceiptService.findTree());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("接单表findTree方法报错，请联系系统开发人员！");
		}
	}

	/**
	 * 查询接单表&转办单
	 */
    @GetMapping(value = "/findall")
    public HttpResult findall(@RequestParam String receiptcode,@RequestParam String address,@RequestParam String callertel) {
		try {
			return HttpResult.ok(treceiptService.findall(receiptcode,address,callertel));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return  HttpResult.error("接单表findall方法报错，请联系系统开发人员！");
		}
    }
	/**
	 * 查询转办单状态 findstatus
	 */
	@PostMapping(value="/findstatus")
	public HttpResult findstatus(@RequestBody Ttransferslip record) {
		try {
			return HttpResult.ok(ttransferslipService.findstatus(record));
		} catch (Exception e) {
			logger.error(e.getMessage());
			return  HttpResult.error("接单表findstatus方法报错，请联系系统开发人员！");
		}
	}
}
