package hx.service;

import java.io.FileInputStream;

import hx.service.spring.UserService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

public class ServiceTest {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		spring();
	}
	
	
	
	
	public static void spring(){
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/applicationContext.xml"));
		UserService us = bf.getBean(UserService.class);
		
		System.out.println("===user:"+us.getUser() );
		
		
	}

}
