package com.yhjqsw.wm.hotline.controller;

import java.util.List;

import com.yhjqsw.wm.core.http.HttpResult;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.hotline.model.Ttransferslip;
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
 * 转办单表：存储转办单的基本信息。 (TtransferslipController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("ttransferslip")
public class TtransferslipController {

	@Autowired
	private TtransferslipService ttransferslipService;
	private static Logger logger =Logger.getLogger(TcategoryController.class);

	/**
	 * 保存转办单表：存储转办单的基本信息。
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Ttransferslip record) {
		try {
			return HttpResult.ok(ttransferslipService.save(record));
		} catch (Exception e) {
			e.printStackTrace();
			return  HttpResult.error("转办单save方法报错，请联系系统开发人员！");
		}
	}

    /**
     * 删除转办单表：存储转办单的基本信息。
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Ttransferslip> records) {
		try {
			return HttpResult.ok(ttransferslipService.delete(records));
		} catch (Exception e) {
			e.printStackTrace();
			return  HttpResult.error("转办单delete方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 根据接单表的id查询
	 */
	@PostMapping(value = "/findByReceiptid")
//	public HttpResult findByReceiptid(@RequestParam Long id){
	public HttpResult findByReceiptid(@RequestBody Ttransferslip record){
		try{
			return HttpResult.ok(ttransferslipService.findByReceiptid(record));
		}catch (Exception e){
			return HttpResult.error("转办单findByReceiptid方法报错，请联系系统开发人员！");
		}
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		try{
			return HttpResult.ok(ttransferslipService.findPage(pageRequest));
		}catch (Exception e){
			return HttpResult.error("转办单findPage方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 查询
	 */
	@PostMapping(value="/findAll")
	public HttpResult findAll() {
		try{
			return HttpResult.ok(ttransferslipService.findAll());
		}catch (Exception e){
			return HttpResult.error("转办单findAll方法报错，请联系系统开发人员！");
		}

	}
	/**
	 * 退办
	 */
	@PostMapping(value = "/updatestatus")
	public HttpResult updatestatus(@RequestBody Ttransferslip record){
		try{
			return HttpResult.ok(ttransferslipService.updatestatus(record));
		}catch (Exception e){
			return HttpResult.error("转办单updatestatus方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 有多少条未查看的转办单
	 */
	@PostMapping(value = "/noView")
	public HttpResult noView(@RequestBody Ttransferslip record){
		try{
			return HttpResult.ok(ttransferslipService.updatestatus(record));
		}catch (Exception e){
			return HttpResult.error("转办单noView方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 查询转办单&接单表
	 */
	@GetMapping(value = "/findTraAndReceipt")
	public HttpResult findTraAndReceipt( @RequestParam String receiptcode ){
		try{
			return HttpResult.ok(ttransferslipService.findTraAndReceipt(receiptcode));
		}catch (Exception e){
			return HttpResult.error("转办单findTraAndReceipt方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 查询未办结的转办单（接单表调用）  iftransferslip
	 */
	@PostMapping(value = "/iftransferslip")
	public HttpResult iftransferslip(@RequestBody Ttransferslip record){
		try{
			return HttpResult.ok(ttransferslipService.iftransferslip(record));
		}catch (Exception e){
			return HttpResult.error("转办单iftransferslip方法报错，请联系系统开发人员！");
		}
	}
	/**
	 * 查询未查看的转办单
	 */
	@PostMapping(value = "/nocheck")
	public HttpResult nocheck(){
		try{
			return HttpResult.ok(ttransferslipService.nocheck());
		}catch (Exception e){
			return HttpResult.error("转办单nocheck方法报错，请联系系统开发人员！");
		}
	}
}
