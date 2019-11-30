import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;



public class jsonresponse {
	
	@Test
	public void postvalidation()
	{
		
		pojoclass ll=new pojoclass();
		ll.getUserId(7);
		String str=given()
		.pathParam("userId", 7)
		.body(ll)
		.when()
		.post("https://jsonplaceholder.typicode.com/posts/{userId}")
		
		.then()
		//.statusCode(200)
		.extract().response().jsonPath().getString("userId");
		System.out.println(str);
		JsonPath path=new JsonPath(str);
		String newstr=path.getString(str);
		System.out.println(newstr);
		
		
		
		
		
	}

	

}
