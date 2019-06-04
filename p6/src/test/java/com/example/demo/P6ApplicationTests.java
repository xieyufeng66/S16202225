package com.example.demo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class P6ApplicationTests {
	@Autowired
	private MockMvc mockMvc;	//mockito,spring-test
	@Test  
	public void testView() throws Exception {  
	    MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))  
	            .andExpect(MockMvcResultMatchers.view().name("user/view"))  
	            .andExpect(MockMvcResultMatchers.model().attributeExists("user"))  
	            .andDo(MockMvcResultHandlers.print())  
	            .andReturn();  
	      
	    Assert.assertNotNull(result.getModelAndView().getModel().get("user"));  
	}  
}
