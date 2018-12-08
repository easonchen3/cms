package com.cm.test;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;

/**
 * 测试student功能
 * @author HP
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class StudentTest {

	//传入SpringMVC 的IOC
		@Autowired
		WebApplicationContext context;
		
		//虚拟Mvc请求，获取请求结果
		MockMvc mockMvc;
		
		@Before
		public void initMockMvc(){
			mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		}
		
		
		@Test
		public void testPage() throws Exception{
			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/students").param("pn", "5"))
				.andReturn();
			//请求成功之后，请求域中会有pageInfo；我们可以取出pageInfo进行验证
			MockHttpServletRequest request = result.getRequest();
			PageInfo page = (PageInfo) request.getAttribute("pageInfo");
			System.out.println("当前页码 : "+page.getPageNum());
			System.out.println("总页码 : "+page.getPages());
			System.out.println("总记录数 : "+page.getTotal());
			System.out.println("在页面连续显示的页码");
			int[] nums = page.getNavigatepageNums();
			for (int i : nums) {
				System.out.print(" "+ i);
			}
			System.out.println();
		}
	
}