package RESTAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class Get02 {

	 @Test
	  
	  public void get02() {
		  baseURI = "https://reqres.in/api";
		  given().get("/users?page=2").then().statusCode(200).log().all();
		  //body("data[1].id", equalTo(8)
	  }
	
}
