package com.yhjqsw.wm.hotline.service.impl;

import java.util.List;

import com.yhjqsw.wm.core.page.ColumnFilter;
import com.yhjqsw.wm.core.page.MybatisPageHelper;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.core.page.PageResult;
import com.yhjqsw.wm.hotline.dao.TreceiptMapper;
import com.yhjqsw.wm.hotline.dao.TtransferslipMapper;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.model.Ttransferslip;
import com.yhjqsw.wm.hotline.service.TtransferslipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * ---------------------------
 * 转办单表：存储转办单的基本信息。 (TtransferslipServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class TtransferslipServiceImpl implements TtransferslipService {

	@Autowired
	private TtransferslipMapper ttransferslipMapper;
	@Autowired
	private TreceiptMapper treceiptMapper;
	@Override
	public int save(Ttransferslip record) {
		Treceipt treceipt=treceiptMapper.findById(record.getReceiptid());//更新转办次数
		if(record.getId() == null || record.getId() == 0) {
			if(treceipt.getTransfertimes()==null){
				treceipt.setTransfertimes(1);
			}else{
				treceipt.setTransfertimes(treceipt.getTransfertimes()+1);
			}
			record.setDeliverytime(new Date());//转办单发送时间
			treceiptMapper.update(treceipt);
			return ttransferslipMapper.add(record);
		}

		//更新转办单状态为2：办理完成(办理结束时间&办理情况都不为空)
		if(record.getEndprocesstime() != null & record.getProcessinf() != null){
			record.setTransferstatus("2");
		}
		return ttransferslipMapper.update(record);
	}
	@Override
	public int delete(Ttransferslip record) {
		return ttransferslipMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Ttransferslip> records) {
		for(Ttransferslip record:records) {
			delete(record);
		}
		return 1;
	}
	@Override
	public  Treceipt findByReceiptid(Ttransferslip ttransferslip){
			int num=ttransferslipMapper.findviewtime(ttransferslip.getId());
			if (num!=0){
				ttransferslip.setViewtime(new Date());//更新查看时间
				ttransferslipMapper.update(ttransferslip);
			}
		return treceiptMapper.findById(ttransferslip.getReceiptid());
	}

	@Override
	public Ttransferslip findById(Long id) {
		return ttransferslipMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, ttransferslipMapper);
	}
	@Override
	public List<Ttransferslip> findAll() {
		List<Ttransferslip> Ttransferslips = ttransferslipMapper.findAll();
		return Ttransferslips;
	}

	@Override
	public int updatestatus(Ttransferslip record) {
		int a=-1;
		Ttransferslip ttransferslip=ttransferslipMapper.findById(record.getId());
		String ifcontractor=ttransferslip.getIfcontractor();//是否承接
		String ncontractreasion=ttransferslip.getNcontractreason();//不承接原因
		if(ncontractreasion==null){
			if (ifcontractor==null||"否".equalsIgnoreCase(ifcontractor)){
				return a;//请填写是否承接与不承接原因字段后退办
			}
		}

		record.setTransferstatus("3");//退办

		return ttransferslipMapper.update(record);
	}

	@Override
	public int findstatus(Ttransferslip record) {
		return ttransferslipMapper.findstatus(record.getId());
	}

	@Override
	public List<Ttransferslip> findTraAndReceipt(String receiptcode) {
		List<Ttransferslip> ttransferslips=ttransferslipMapper.findTraAndReceipt(receiptcode);
		return ttransferslips;
	}

	@Override
	public int iftransferslip(Ttransferslip record) {
		int num = 0;
		if(ttransferslipMapper.iftransferslip(record.getReceiptid()) != 0){
			num = 1;
		}
		return num;
	}

	@Override
	public List<Ttransferslip> nocheck() {
		return ttransferslipMapper.nocheck();
	}

}
