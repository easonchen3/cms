package com.cm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.ClassMapper;
import com.cm.pojo.Class;

@Service
public class ClassService {

	@Autowired
	ClassMapper classMapper;
	/**
	 * 获取所有班级
	 * @return
	 */
	public List<Class> getClasses() {
		List<Class> classes = classMapper.selectByExample(null);
		return classes;
	}

}
