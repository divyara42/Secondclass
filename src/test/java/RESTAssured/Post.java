package RESTAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;


public class Post {
	@Test
  public void testget() {
	  
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200);
		
		
  }
	@Test
public  void testPost() {
	Map<String, Object> map = new HashMap<String, Object>();
	//map.put("name","divya");
	//map.put("Job","RA");
	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	request.put("name", "Divya");
	request.put("job", "QA");
	System.out.println(request);
	baseURI = "https://reqres.in/api";
	given().body(request.toJSONString()).
	when().
	post("/users").
	then().
	statusCode(201).
	log().all();
	
}
	
}
