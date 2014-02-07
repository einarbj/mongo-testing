package com.evry.spring;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface TestDataRepoSpring extends MongoRepository<TestData, String>, QueryDslPredicateExecutor<TestData>{


	
}
