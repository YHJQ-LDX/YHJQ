package com.yhjqsw.wm.hotline.model;

/**
 * ---------------------------
 * 类别表：存储问题分类的基本信息。 (Tcategory)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Tcategory {

	/**  */
	private Long id;
	/** 分类 */
	private String category;
	/** 最长处理时间 */
	private float maxprocesstime;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getMaxprocesstime() {
		return maxprocesstime;
	}

	public void setMaxprocesstime(float maxprocesstime) {
		this.maxprocesstime = maxprocesstime;
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