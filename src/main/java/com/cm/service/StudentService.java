package com.cm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.StudentMapper;
import com.cm.pojo.Student;
import com.cm.pojo.StudentExample;
import com.cm.pojo.StudentExample.Criteria;



@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	/**
	 * 查询所有学生
	 * @return
	 */
	public List<Student> getAll() {
		return studentMapper.selectByExampleWithClass(null);
	}

	/**
	 * 保存学生信息
	 * @param student
	 * @return 
	 */
	public int save(Student student) {
		return studentMapper.insertSelective(student);
	}

	/**
	 * 查询学号是否重复
	 * @param username
	 * @return
	 */
	public boolean checkUser(String username) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andSUsernameEqualTo(username);
		long count = studentMapper.countByExample(example);
		return count == 0;
	}
	/**
	 * 按照学生id查询学生
	 * @param id
	 * @return
	 */
	public Student getStu(Integer id) {
		// TODO Auto-generated method stub
		Student student = studentMapper.selectByPrimaryKey(id);
		return student;
	}
	/**
	 * 验证登陆
	 * @param s_name
	 * @return
	 */
	public Student login(String s_name) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andSUsernameEqualTo(s_name);
		List<Student> students =studentMapper.selectByExampleWithClass(example);
		return students.get(0);
	}

	
}
