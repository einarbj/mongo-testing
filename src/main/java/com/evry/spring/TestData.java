package com.evry.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@com.google.code.morphia.annotations.Entity
public class TestData {

    @Id
    private String id;

    private String a;

    private String b;

    private NestedTestData nestedTestData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNestedTestData(NestedTestData nestedTestData) {
        this.nestedTestData = nestedTestData;
    }

    public NestedTestData getNestedTestData() {
        return nestedTestData;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}
