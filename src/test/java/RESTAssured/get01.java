package RESTAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class get01 {
	
  @Test
	public void get_1() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
	}
  
  @Test
  public void get02() {
	  baseURI = "https://reqres.in/api";
	  given().get("/users?page=2").then().statusCode(200);
	  
  }
  
  
  
  
}


