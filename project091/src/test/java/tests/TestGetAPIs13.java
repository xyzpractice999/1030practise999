package tests;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs13 {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects";
		RequestSpecification req=RestAssured.given();
		//req.header("Authorization","Bearer dg7d9g8d0h80fh0fh0fdafdfdafdfdffestw5555555756rtgdfs");
		Response res=req.get();
		System.out.println(res.body().asString());
		List<String> colors=res.jsonPath().getList("data.color");
		System.out.println(colors.get(1));
//		System.out.println(res.jsonPath().getInt("[2].data[\"capacity GB\"]"));
//		String names=res.jsonPath().getString("name");
//		String name=res.jsonPath().getString("[8].name");
//		System.out.println(name);
//		System.out.println(names);
		
		

	}
}
