package com.cm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cm.pojo.Msg;
import com.cm.pojo.Student;
import com.cm.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	/**
     * 登录功能
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Msg login(@RequestParam("username")String s_name, @RequestParam("password")String s_password,
    		HttpSession session) {
    	Student student = studentService.login(s_name);
        if (student != null) {
        	if(student.getsPassword().equals(s_password)){
        		session.setAttribute("stu", student);
        		return Msg.success().add("stu", student);
        	}else{
        		return Msg.fail().add("message", "用户名或密码错误");
        	}
        } else {
            return Msg.fail().add("message", "登录失败");
        }
    }

	/**
	 * 根据id查询学生
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/stu/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("sId") Integer id){
		Student student = studentService.getStu(id);
		return Msg.success().add("stu", student);
	}
	
	
	/**
	 * 检查用户名是否可用
	 * @param username
	 * @return
	 */
	@RequestMapping("/checkuser")
	@ResponseBody
	public Msg checkNum(@RequestParam("username") String username){
		//判断学号是否合法
		String rex = "^0[1-9]1\\d{5}$";
		if(!username.matches(rex)){
			return Msg.fail().add("message", "学号必须是8位数！");
		}
		//数据库用户名重复校验
		boolean b = studentService.checkUser(username);
		if(b){
			return Msg.success();
		}else{
			return Msg.fail().add("message", "学号不可用");
		}
	}
	
	/**
	 * 保存学生
	 * @param student
	 * @param result
	 * @return
	 */
	@RequestMapping(value="/stu",method=RequestMethod.POST)
	@ResponseBody
	public Msg savaEmp(@Valid Student student,BindingResult result){
		if(result.hasErrors()){
			//校验失败返回失败。，在模态框里显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();	
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误的信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map); 
		}else{
			studentService.save(student);
			return Msg.success();
		}
	}
	
	/**
	 * 查询所有学生带班级
	 * @param pn
	 * @return
	 */
	@RequestMapping("/stus")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn){
		//不是一个分页查询
		//引入PageHelper分页插件
		//在查询之前只需要调用,传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		//starPage后面紧跟的查询就是分页查询
		List<Student> emps = studentService.getAll();
		//使用PageInfo包装查询后的结果，只需要把PageInfo交给页面
		//封装了详细的分页信息，包括了查询出来的信息,传入连续显示的页数
		PageInfo page = new PageInfo(emps,5);
		return Msg.success().add("pageInfo", page);
	}
}
