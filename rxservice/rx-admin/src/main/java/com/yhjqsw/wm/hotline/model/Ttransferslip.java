package com.yhjqsw.wm.hotline.model;

import java.util.List;

/**
 * ---------------------------
 * 转办单表：存储转办单的基本信息。 (Ttransferslip)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Ttransferslip {

	/**  */
	private Long id;
	/**  */
	private Long receiptid;
	/** 转办员 */
	private String transferer;
	/** 前转办单ID */
	private Long preid;
	/** 再次转办原因 */
	private String posttransreason;
	/** 转办单发送时间 */
	private java.util.Date deliverytime;
	/** 转办单查看时间 */
	private java.util.Date viewtime;
	/** 是否承接 */
	private String ifcontractor;
	/** 不承接原因 */
	private String ncontractreason;
	/** 承接单位 */
	private String contractorunit;
	/** 承接人 */
	private String contractor;
	/** 转办单状态 */
	private String transferstatus;
	/** 办理开始时间 */
	private java.util.Date startprocesstime;
	/** 办理结束时间 */
	private java.util.Date endprocesstime;
	/** 办理情况 */
	private String processinf;
	/** 备注 */
	private String remark;
	/** 接单表*/
	private Treceipt receipt;

	public Treceipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Treceipt receipt) {
		this.receipt = receipt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReceiptid() {
		return receiptid;
	}

	public void setReceiptid(Long receiptid) {
		this.receiptid = receiptid;
	}

	public String getTransferer() {
		return transferer;
	}

	public void setTransferer(String transferer) {
		this.transferer = transferer;
	}

	public Long getPreid() {
		return preid;
	}

	public void setPreid(Long preid) {
		this.preid = preid;
	}

	public String getPosttransreason() {
		return posttransreason;
	}

	public void setPosttransreason(String posttransreason) {
		this.posttransreason = posttransreason;
	}

	public java.util.Date getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(java.util.Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	public java.util.Date getViewtime() {
		return viewtime;
	}

	public void setViewtime(java.util.Date viewtime) {
		this.viewtime = viewtime;
	}

	public String getIfcontractor() {
		return ifcontractor;
	}

	public void setIfcontractor(String ifcontractor) {
		this.ifcontractor = ifcontractor;
	}

	public String getNcontractreason() {
		return ncontractreason;
	}

	public void setNcontractreason(String ncontractreason) {
		this.ncontractreason = ncontractreason;
	}

	public String getContractorunit() {
		return contractorunit;
	}

	public void setContractorunit(String contractorunit) {
		this.contractorunit = contractorunit;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getTransferstatus() {
		return transferstatus;
	}

	public void setTransferstatus(String transferstatus) {
		this.transferstatus = transferstatus;
	}

	public java.util.Date getStartprocesstime() {
		return startprocesstime;
	}

	public void setStartprocesstime(java.util.Date startprocesstime) {
		this.startprocesstime = startprocesstime;
	}

	public java.util.Date getEndprocesstime() {
		return endprocesstime;
	}

	public void setEndprocesstime(java.util.Date endprocesstime) {
		this.endprocesstime = endprocesstime;
	}

	public String getProcessinf() {
		return processinf;
	}

	public void setProcessinf(String processinf) {
		this.processinf = processinf;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}