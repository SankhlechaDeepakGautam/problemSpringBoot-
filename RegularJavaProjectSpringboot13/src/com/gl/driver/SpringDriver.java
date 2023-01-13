package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimp.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		Teacher teacher = context.getBean("hindiTeacher",HindiTeacher.class);
		
		System.out.println(teacher.getHomework());
		
		context.close();

	}

}
