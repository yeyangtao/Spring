package com.yyt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yyt.pojo.Category;
import com.yyt.pojo.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		Category cg = (Category) context.getBean("c");
		System.out.println("id:"+cg.getId()+" name:"+cg.getName());
		
		
		Product p = (Product) context.getBean("p");
		System.out.println("id:"+p.getId()+" name:"+p.getName()+" price:"+p.getPrice());
		//输出注入的对象
		System.out.println(p.getCategory().getName());

	}

}
