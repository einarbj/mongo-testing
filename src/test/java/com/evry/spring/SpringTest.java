package com.evry.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class SpringTest {

	@Autowired
	TestDataRepo repo;

	@Autowired
	MongoOperations mongoOperations;

	@Test
	public void find() {
		repo.findByName("bla");
	}

	@Test
	public void save() {
		/*
		TestData entity = new TestData("fooWithChild", "bar");
		entity.setNestedTestData(new NestedTestData("NestedData"));
		repo.save(entity);
                        */
	}
	
	
}
