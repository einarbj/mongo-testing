
package com.evry.spring;

public interface TestDataRepo {
    TestData findByName(String name);
    void save(TestData testData);
}
