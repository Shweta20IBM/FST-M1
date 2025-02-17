package restassured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Rest_assured_Project {
	RequestSpecification requestSpec;
	String key;
	int id;
	
	@BeforeClass
	public void setUp() {
		requestSpec=new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.addHeader("Authorization", "token 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")
				.setBaseUri("https://api.github.com")
				.build();
		
	}
	
  @Test (priority=1)
  public void addSSHKey() {
	  
	  String reqBody="""
	  		{
                    "title": "TestAPIKey",
                    "key": "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHcTQgZEDUPot+o+EPSTKwEOyzzF06emq1T4o+FhHyst"

            } 
	  		""";
	  
	  Response response=given().log().all().spec(requestSpec).body(reqBody).when().post("/user/keys");
	  
	  String body=response.getBody().asPrettyString();
	  System.out.println(body);	
	  
	  response.then().statusCode(201);
	  
	  id=response.jsonPath().getInt("id");
	  	  
  }
  
  @Test (priority=2)
  public void getSSHKey() {
	  
	  Response response=given().log().all()
			  .spec(requestSpec).pathParam("keyId", id)
			  .when().get("/user/keys/{keyId}");
	  
	  String body=response.getBody().asPrettyString();
	  System.out.println(body);	 
	  
	  response.then().statusCode(200);  
	  
  }
  
  @Test (priority=3)
  public void deleteSSHKey() {
	  
	  Response response=given().log().all()
			  .spec(requestSpec).pathParam("keyId", id)
			  .when().delete("/user/keys/{keyId}");
	  
	  String body=response.getBody().asPrettyString();
	  System.out.println(body);	 
	  
	  response.then().statusCode(204);
	  
  }
}
