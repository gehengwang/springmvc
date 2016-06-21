package org.ghw.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BaseBean {
	
	public void doSomething(){
		System.out.println("一些业务逻辑...");
	}
	
	public String doSomethingReturn(){
		System.out.println("一些业务逻辑...");
		//int i = 1/0;
		return "结果";
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		BaseBean bb = (BaseBean) ac.getBean(org.ghw.aop.aspect.BaseBean.class);
		//bb.doSomething();
		bb.doSomethingReturn();
	}
	
	
}
