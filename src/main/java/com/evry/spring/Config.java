package com.evry.spring;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.mongodb.Mongo;

@Configuration
@EnableMongoRepositories(basePackages = "com.evry.spring", includeFilters = @ComponentScan.Filter(value = {TestDataRepoSpring.class}, type = FilterType.ASSIGNABLE_TYPE))
public class Config {

    @Bean
    public MongoTemplate mongoTemplate(Mongo mongo) throws UnknownHostException {
        return new MongoTemplate(mongo, "test");
    }

    @Bean
    public Mongo mongo() throws UnknownHostException {
        return new Mongo("localhost");
    }

    @Bean
    public TestDataRepo testDataRepo() {
        return new TestDataRepoMongo();
    }

}
