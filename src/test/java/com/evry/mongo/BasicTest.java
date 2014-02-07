package com.evry.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import org.junit.Ignore;
import org.junit.Test;

public class BasicTest {

    @Ignore
	@Test
	public void foo() throws UnknownHostException {
		MongoClient client = new MongoClient("localhost", 27017 );
		
		DB db = client.getDB("test");
		
		
		System.out.println(db.getCollectionNames());
		
		System.out.println(db.getCollection("test").findOne());
	}
	
}
