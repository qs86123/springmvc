package com.zhenjie.springmvc.handlers;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhenjie.springmvc.entities.User;
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	private static final String SUCCESS="success";
	
	
	/**
	 * 可以使用Servlet 原生的API 作为目标方法的参数 具体支持以下类型
	 * HttpServletRequest 
	 * HttpServletResponse
	 * HttpSession
	 * java.security.Principal
	 * Locale 
	 * InputStream
	 * OutputStream
	 * Reader
	 * Writer
	 *
	 *
	 *
	 */
	@RequestMapping("testServletIPI")
	public void testServletIPI(HttpServletRequest request,HttpServletResponse response,
			Writer out) {
		System.out.println("testServletIPI:"+request+"\n"+response);
		try {
			out.write("hello World!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return SUCCESS;
	}
	/**
	 * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹配。
	 * 自动为该对象填充属性值，支持级联属性
	 * 
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo:"
		+user.getUsername()+":"
		+user.getPassword()+":"
		+user.getEmail()+":"
		+user.getAge()+":"
		+user.getAddress().getCity()+":"
		+user.getAddress().getProvince());
		return SUCCESS;
		
	}
	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id) {
		System.out.println("testRestPUT:"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("testRestDELETE:"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest",method=RequestMethod.POST)
	public String testRest() {
		System.out.println("testRestPOST");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String testRest(@PathVariable Integer id) {
		System.out.println("testRest GET:"+id);
		return SUCCESS;
	}
	/**
	 * @PathVariable 可以来映射URL 中的占位符到目标参数中
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable："+id);
		return SUCCESS;
	}
	/**
	 * 常用：使用method 属性来指定请求方式
	 */
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	/**
	 * 1.@RequestMapping 除了可以修饰方法，还可以修饰类
	 * 2.
	 * 1).类定义处： 提供初步的请求映射信息。相对于 WEB 应用的根目录
	 * 2).方法处： 提供进一步的细分映射信息。
	 * 相对类定义处的 URL。若类定义处未标注@RequestMapping，则方法处URL 相对WEB 应用的根目录
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
		
	}
}
