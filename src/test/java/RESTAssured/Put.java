package RESTAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

public class Put {
	@Test
	public void put() {
		
   	JSONObject request = new JSONObject();
   	request.put("name", "rani");
   	request.put("job", "QA");

	}
}
