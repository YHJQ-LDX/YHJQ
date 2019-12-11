package com.yhjqsw.wm.hotline.service.impl;

import java.util.List;

import com.yhjqsw.wm.admin.util.SecurityUtils;
import com.yhjqsw.wm.core.page.ColumnFilter;
import com.yhjqsw.wm.core.page.MybatisPageHelper;
import com.yhjqsw.wm.core.page.PageRequest;
import com.yhjqsw.wm.core.page.PageResult;
import com.yhjqsw.wm.hotline.dao.TcategoryMapper;
import com.yhjqsw.wm.hotline.model.Tcategory;
import com.yhjqsw.wm.hotline.service.TcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ---------------------------
 * 类别表：存储问题分类的基本信息。 (TcategoryServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-09-03 14:28:54
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class TcategoryServiceImpl implements TcategoryService {

	@Autowired
	private TcategoryMapper tcategoryMapper;

	@Override
	public int save(Tcategory record) {
		if(record.getId() == null || record.getId() == 0) {
			record.setCreateby(SecurityUtils.getUsername());
			record.setCreatetime(new java.util.Date());
			return tcategoryMapper.add(record);
		}
		record.setLastupdateby(SecurityUtils.getUsername());
		record.setLastupdatetime(new java.util.Date());
		return tcategoryMapper.update(record);
	}

	@Override
	public int delete(Tcategory record) {
		return tcategoryMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Tcategory> records) {
		for(Tcategory record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Tcategory findById(Long id) {
		return tcategoryMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
		if(columnFilter != null) {
			return MybatisPageHelper.findPage(pageRequest, tcategoryMapper, "findPageByCondition", columnFilter.getValue());
//			return MybatisPageHelper.findPage(pageRequest, tcategoryMapper);
		}
		return MybatisPageHelper.findPage(pageRequest, tcategoryMapper);
	}

	@Override
	public List<Tcategory> findAll() {
		return tcategoryMapper.findAll();
	}
}
