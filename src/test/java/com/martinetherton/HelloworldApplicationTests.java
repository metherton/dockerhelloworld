package com.martinetherton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloworldApplication.class)
public class HelloworldApplicationTests {

	@Autowired
	Person person;

	@Test
	public void contextLoads() {
	}

	@Test
	public void personInitializedCorrectly() {
		Assert.assertTrue(person.getFirstName() == "Martin");
	}

}
