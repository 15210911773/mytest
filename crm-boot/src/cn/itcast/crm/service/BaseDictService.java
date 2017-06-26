package cn.itcast.crm.service;

import java.util.List;

import cn.itcast.crm.bean.BaseDict;

public interface BaseDictService {

	List<BaseDict> getDictListByTypeCode(String typeCode);
}
