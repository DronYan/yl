package com.yc.vue.d1128;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *	留言相关的servlet 
 * 	
 * 	url: /msg.s
 * 	
 * 	规则1： 使用op请求参数区分不同操作类型
 * 	请求： 发布留言：	/msg.s?op=add
 * 		查询留言:	/msg.s?op=query
 * 		回复留言	/msg.s?op=reply
 * 		....
 * 	规则2：定义不同业务方法对应处理不同的请求， 用方法名和 op 值对应
 * 		public void add(...) ==> op=add
 * 		public void query(...) ==> op=query
 * 		
 * 	BaseServlet 是一个共同父类， 业务方法写在子类中
 * 		java 黑科技 —— 反射
 * 	
 */
//@WebServlet("/BaseServlet") // 不定义BaseServlet的地址 
// BaseServlet 不希望被创建对象（new）， 只允许继承
public abstract class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// final 禁止子类重写该方法
	protected final void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 在此设置字符集编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String op = request.getParameter("op");
		if (op == null) {
			throw new ServletException("必须提供op字段！");
		}
		// 通过反射获取 public 方法对象
		// getClass().getMethod(name, parameterTypes)
		try {
			// 通过反射获取 定义的（当前类中定义的） 方法对象
			Method m = getClass().getDeclaredMethod(op, HttpServletRequest.class, HttpServletResponse.class);
			// 设置强制访问 （非public）
			m.setAccessible(true);
			// 调用method对象， 执行方法
			m.invoke(this, request, response);
		} catch (NoSuchMethodException | SecurityException e) {
			throw new ServletException("获取" + op + "方法失败！", e);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new ServletException("调用" + op + "方法失败！", e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
