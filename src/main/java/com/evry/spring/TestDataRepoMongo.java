package com.evry.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class TestDataRepoMongo implements TestDataRepo {

    @Autowired
    private TestDataRepoSpring repo;

    public TestData findByName(String name) {
        return repo.findOne(QTestData.testData.name.eq(name));
    }
}
