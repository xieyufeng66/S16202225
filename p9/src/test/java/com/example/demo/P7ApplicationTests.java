package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class P7ApplicationTests {
	@Autowired
	private TeacherRepository tr;

	@Test
	public void contextLoads() {
		Teacher teacher=tr.validTeacher("teacher", "123");
		assertEquals(teacher.getId(),2);
	}

}

