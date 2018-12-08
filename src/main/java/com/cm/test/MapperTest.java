package com.cm.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cm.dao.ClassMapper;
import com.cm.dao.StudentMapper;
import com.cm.pojo.Student;

/**
 * 测试dao层
 * @author HP
 * 推荐spring的项目就可以用spring的测试
 * 1.导入SpringTest模块 指定spring配置文件的位置
 * 3.直接 @autoWired
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	ClassMapper mapper;
	
	@Autowired
	StudentMapper mapper1;
	
	@Autowired
	SqlSession sqlSession;
	@Test
	public void testCRUD(){
		/*//1.创建springIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从容器中获取mapper
		DepartmentMapper mapper = ioc.getBean(DepartmentMapper.class);*/
		System.out.println(mapper);
		//1.插入几个班级
		//mapper.insertSelective(new Class(null,"计科1601班","计算机与科学","计算机学院"));
		
		//2.生成员工数据
		//mapper1.insertSelective(new Employee(null,"jerry","M","jerry@163.com",1));
		//mapper1.insertSelective(new Student(null,"04163022","张三","123456",2,"@163.com","1",0));
		
		//3.批量插入多个员工，批量  使用可以执行批量操作的SQLSession
		
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		for(int i = 10 ; i < 100 ; i++){
			String uid = UUID.randomUUID().toString().substring(0,5) + i;
			mapper.insertSelective(new Student(null,"041630"+i,uid,"123456",1,uid+"@163.com","1",0));
		}
		System.out.println("批量完成");
	}

}
