package com.evry.spring;

import java.util.UUID;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class SpringTest {

	@Autowired
	TestDataRepo repo;
        
        @Ignore
	@Test
	public void find() {
		repo.findByName("bla");
	}
        
        @Ignore
	@Test
	public void save() {
		TestData entity = new TestData();
                entity.setId(UUID.randomUUID().toString());
                entity.setA("a");
                entity.setB("b");
		entity.setNestedTestData(new NestedTestData("NestedData"));
		repo.save(entity);      
	}
	
	
}
