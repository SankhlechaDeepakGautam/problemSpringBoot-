package com.gl.driver;

import com.gl.service.Teacher;
import com.gl.serviceimp.GkTeacher;
import com.gl.serviceimp.HindiTeacher;

public class main {

	public static void main(String[] args) {
		Teacher teacher = new HindiTeacher();
		
		System.out.println(teacher.getHomework());
	}

}
