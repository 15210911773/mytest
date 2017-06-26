package cn.itcast.crm.dao;

import java.util.List;

import cn.itcast.crm.bean.BaseDict;

public interface BaseDictMapper {

	List<BaseDict> getDictList(String typeCode);
}
