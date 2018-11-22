package com.qingruihappy2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author qingruihappy
 * @data 2018年11月23日 上午1:05:45
 * @说明: 通过上面的代码我们可以看出它的顺序
 *      1，浏览器request请求过来，到前端控制器。（DispatcherServlet）。。。。ps：在项目启动的时候已经通过扫包把所有@Controller注解的类已经加到一个map中去了，其中key就是类名小写，value就是实例
 *      2，在前端处理器中（DispatcherServlet）通过处理器映射器（HandlerMapping）来确定调用的类和方法
 *      3，处理器处理代码逻辑（Handler），程序员自己写的代码。
 *      4，让后通过处理器的适配器（HandlerAdapter）去返回视图解析器（ModelAndView）。。。。ps：也就是我们常看到的<property
 *      name="prefix" value="/" /> <property name="suffix" value=".jsp" /> 这段代码
 *      5，在前端控制器中再把视图解析器渲染成视图（view）返回
 */
@Controller
@RequestMapping("/ext")
public class ExtIndexController {
	// ext/test/?name=122&age=6440654
	@RequestMapping("/test")
	public String test() {
		System.out.println("手写springmvc框架...");
		return "index";
	}

}
