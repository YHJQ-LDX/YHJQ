package com.yhjqsw.wm.hotline.model;

import java.util.List;

/**
 * ---------------------------
 * 接单表：存储接单表的基本信息。 (Treceipt)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Treceipt {

	/** id */
	private Long receiptid;
	/** 编号（转办单号） */
	private String receiptcode;
	/** 接单时间 */
	private java.util.Date acceptancetime;
	/** 建单人 */
	private String createname;
	/** 来电人姓名 */
	private String callername;
	/** 来电人电话 */
	private String callertel;
	/** 事件地点 */
	private String address;
	/** 事件分类 */
	private String category;
	/** 事件内容 */
	private String telcontent;
	/** 是否转办
1-转办，生成转办单id
0-不转办 */
	private String iftransferslip;
	/** 转办次数 */
	private Integer transfertimes;
	/** 处理结果 */
	private String processresults;
	/** 是否回访
1-已回访
0-未回访 */
	private String ifvisitback;
	/** 回访人 */
	private String visitors;
	/** 回访时间 */
	private java.util.Date revisittime;
	/** 是否满意
1-满意
0-不满意 */
	private String ifsatisfied;
	/** 是否办结
1-办结
0-未办结 */
	private String ifsettlement;
	/** 办结时间 */
	private java.util.Date settlementtime;
	/** 创建人编码 */
	private String createby;
	/** 创建时间 */
	private java.util.Date createtime;
	/** 更新人编码 */
	private String lastupdateby;
	/** 更新时间 */
	private java.util.Date lastupdatetime;
	/** 备注 */
	private String remark;


	private Long parentId;
	private List<Treceipt> children;

	// 非数据库字段
	private String parentName;
	// 非数据库字段
	private Integer level;
	//转办单集合
	private List<Ttransferslip> ttransferslip;

	public List<Ttransferslip> getTtransferslip() {
		return ttransferslip;
	}

	public void setTtransferslip(List<Ttransferslip> ttransferslip) {
		this.ttransferslip = ttransferslip;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public List<Treceipt> getChildren() {
		return children;
	}

	public void setChildren(List<Treceipt> children) {
		this.children = children;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Long getReceiptid() {
		return receiptid;
	}

	public void setReceiptid(Long receiptid) {
		this.receiptid = receiptid;
	}

	public String getReceiptcode() {
		return receiptcode;
	}

	public void setReceiptcode(String receiptcode) {
		this.receiptcode = receiptcode;
	}

	public java.util.Date getAcceptancetime() {
		return acceptancetime;
	}

	public void setAcceptancetime(java.util.Date acceptancetime) {
		this.acceptancetime = acceptancetime;
	}

	public String getCreatename() {
		return createname;
	}

	public void setCreatename(String createname) {
		this.createname = createname;
	}

	public String getCallername() {
		return callername;
	}

	public void setCallername(String callername) {
		this.callername = callername;
	}

	public String getCallertel() {
		return callertel;
	}

	public void setCallertel(String callertel) {
		this.callertel = callertel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTelcontent() {
		return telcontent;
	}

	public void setTelcontent(String telcontent) {
		this.telcontent = telcontent;
	}

	public String getIftransferslip() {
		return iftransferslip;
	}

	public void setIftransferslip(String iftransferslip) {
		this.iftransferslip = iftransferslip;
	}

	public Integer getTransfertimes() {
		return transfertimes;
	}

	public void setTransfertimes(Integer transfertimes) {
		this.transfertimes = transfertimes;
	}

	public String getProcessresults() {
		return processresults;
	}

	public void setProcessresults(String processresults) {
		this.processresults = processresults;
	}

	public String getIfvisitback() {
		return ifvisitback;
	}

	public void setIfvisitback(String ifvisitback) {
		this.ifvisitback = ifvisitback;
	}

	public String getVisitors() {
		return visitors;
	}

	public void setVisitors(String visitors) {
		this.visitors = visitors;
	}

	public java.util.Date getRevisittime() {
		return revisittime;
	}

	public void setRevisittime(java.util.Date revisittime) {
		this.revisittime = revisittime;
	}

	public String getIfsatisfied() {
		return ifsatisfied;
	}

	public void setIfsatisfied(String ifsatisfied) {
		this.ifsatisfied = ifsatisfied;
	}

	public String getIfsettlement() {
		return ifsettlement;
	}

	public void setIfsettlement(String ifsettlement) {
		this.ifsettlement = ifsettlement;
	}

	public java.util.Date getSettlementtime() {
		return settlementtime;
	}

	public void setSettlementtime(java.util.Date settlementtime) {
		this.settlementtime = settlementtime;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public java.util.Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public String getLastupdateby() {
		return lastupdateby;
	}

	public void setLastupdateby(String lastupdateby) {
		this.lastupdateby = lastupdateby;
	}

	public java.util.Date getLastupdatetime() {
		return lastupdatetime;
	}

	public void setLastupdatetime(java.util.Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}