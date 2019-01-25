package com.cxsl.ims;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImsApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
		System.out.println("this is just a spring-boot test...");
	}

	@Before
	public void initMock() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testList() throws Exception {
		final ResultActions results = mockMvc
				.perform(get("/list"))
				.andExpect(MockMvcResultMatchers.status().isOk());
		results.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult mvcResult) throws Exception {
				System.out.println(mvcResult.getResponse().getContentAsString());
			}
		});
	}

}
