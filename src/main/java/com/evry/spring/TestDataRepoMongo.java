package com.evry.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class TestDataRepoMongo implements TestDataRepo {

    @Autowired
    private TestDataRepoSpring repo;

    public TestData findByName(String name) {
        return repo.findOne(QTestData.testData.a.eq(name));
    }

    public void save(TestData testData) {
        repo.save(testData);
    }
    
    
}
