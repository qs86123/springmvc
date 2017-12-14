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
	 * ����ʹ��Servlet ԭ����API ��ΪĿ�귽���Ĳ��� ����֧����������
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
	 * Spring MVC �ᰴ����������� POJO �����������Զ�ƥ�䡣
	 * �Զ�Ϊ�ö����������ֵ��֧�ּ�������
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
	 * @PathVariable ������ӳ��URL �е�ռλ����Ŀ�������
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable��"+id);
		return SUCCESS;
	}
	/**
	 * ���ã�ʹ��method ������ָ������ʽ
	 */
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	/**
	 * 1.@RequestMapping ���˿������η�����������������
	 * 2.
	 * 1).�ඨ�崦�� �ṩ����������ӳ����Ϣ������� WEB Ӧ�õĸ�Ŀ¼
	 * 2).�������� �ṩ��һ����ϸ��ӳ����Ϣ��
	 * ����ඨ�崦�� URL�����ඨ�崦δ��ע@RequestMapping���򷽷���URL ���WEB Ӧ�õĸ�Ŀ¼
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
		
	}
}
