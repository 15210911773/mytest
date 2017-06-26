package cn.itcast.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.crm.bean.BaseDict;
import cn.itcast.crm.dao.BaseDictMapper;
import cn.itcast.crm.service.BaseDictService;

/**
 * 字典表管理Service
 * <p>Title: BaseDictServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> getDictListByTypeCode(String typeCode) {
		List<BaseDict> list = baseDictMapper.getDictList(typeCode);
		return list;
	}

}
