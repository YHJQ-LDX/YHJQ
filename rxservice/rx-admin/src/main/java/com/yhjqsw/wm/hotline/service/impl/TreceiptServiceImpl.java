package com.yhjqsw.wm.hotline.service.impl;

import com.yhjqsw.wm.admin.util.SecurityUtils;
import com.yhjqsw.wm.core.page.MybatisPageHelper;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.core.page.PageResult;
import com.yhjqsw.wm.hotline.dao.TreceiptMapper;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.service.TreceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ---------------------------
 * 接单表：存储接单表的基本信息。 (TreceiptServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class TreceiptServiceImpl implements TreceiptService {

	@Autowired
	private TreceiptMapper treceiptMapper;

	@Override
	public int save(Treceipt record) {
		if(record.getReceiptid() == null || record.getReceiptid() == 0) {
			record.setAcceptancetime(new java.util.Date());//接单时间
			record.setCreatename(SecurityUtils.getUsername());//建单人
			record.setCreateby(SecurityUtils.getUsername());
			record.setCreatetime(new java.util.Date());

			return treceiptMapper.add(record);
		}
		record.setLastupdateby(SecurityUtils.getUsername());
		record.setLastupdatetime(new java.util.Date());
		return treceiptMapper.update(record);
	}

	@Override
	public int delete(Treceipt record) {
		return treceiptMapper.delete(record.getReceiptid());
	}

	@Override
	public int delete(List<Treceipt> records) {
		for(Treceipt record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public List<Treceipt> findTree() {
		List<Treceipt> sysDepts = new ArrayList<>();
		List<Treceipt> depts = treceiptMapper.findAll();
		for (Treceipt dept : depts) {
			if (dept.getParentId() == null || dept.getParentId() == 0) {
				dept.setLevel(0);
				sysDepts.add(dept);
			}
		}
		findChildren(sysDepts, depts);
		return sysDepts;
	}

//	@Override
//	public List<Treceipt> findall(String receiptcode,String address) {
//		List<Treceipt> treceipts = treceiptMapper.findall(receiptcode,address);
//		String enddateStr =  getColumnFilterValue(pageRequest, "enddate");
//		return treceipts;
//		return MybatisPageHelper.findPage(pageRequest, wmDaywaterinMapper,"findPage", username,deptname,begindateStr,enddateStr);
//
//	}
	@Override
	public List<Treceipt> findall(String receiptcode,String address,String callertel) {
		List<Treceipt> treceipts = treceiptMapper.findall(receiptcode,address,callertel);
		return treceipts;
	}

	private void findChildren(List<Treceipt> sysDepts, List<Treceipt> depts) {
		for (Treceipt sysDept : sysDepts) {
			List<Treceipt> children = new ArrayList<>();
			for (Treceipt dept : depts) {
				if (sysDept.getReceiptid() != null && sysDept.getReceiptid().equals(dept.getParentId())) {
//					dept.setParentName(dept.getName());
					dept.setParentName(sysDept.getReceiptcode());
					dept.setLevel(sysDept.getLevel() + 1);
					children.add(dept);
				}
			}
			sysDept.setChildren(children);
			findChildren(children, depts);
		}
	}
	@Override
	public Treceipt findById(Long id) {
		return treceiptMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, treceiptMapper);
	}
	
}
