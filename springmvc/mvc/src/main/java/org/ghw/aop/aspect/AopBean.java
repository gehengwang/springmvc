package org.ghw.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopBean {
	@Pointcut("execution(* org.ghw.aop..*.*(..))")
	public void method(){
		System.out.println("method1");
	};
	
	@Before("method()")
	public void before(){
		System.out.println("Before");
	}
	
	@After("method()")
	public void after(){
		System.out.println("After");
	}
	
	@Around("method()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Around«∞÷√");
		Object result = pjp.proceed();
		System.out.println("Around∫Û÷√");
		return result;
	}
	
	@AfterReturning(pointcut="method()",returning="retVal")
	public void afterReturning(Object retVal){
		System.out.println("AfterReturning:"+retVal);
	}
	
	@AfterThrowing(pointcut="method()",throwing="e")
	public void afterThrowing(Exception e){
		System.out.println("AfterThrowing"+e.getMessage());
	}
	
	
}
