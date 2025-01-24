import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GitHub_RestAssured_Project1 {

	
	RequestSpecification requestSpec1;
	
	private RequestSpecification requestSpec;
    private String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHcTQgZEDUPot+o+EPSTKwEOyzzF06emq1T4o+FhHyst"; 
    private int sshKeyId;

    @BeforeClass
    public void setup() {
        
        requestSpec1 = new RequestSpecBuilder()
                .setContentType("application/json")
                .addHeader("Authorization", "token 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") 
                .setBaseUri("https://api.github.com")
                .build();
    }

    @Test
    public void testAddSSHKey() {
        // Create a JSON body for the POST request
        String requestBody = "{" +
                "\"title\": \"TestKey\"," +
                "\"key\": \"" + sshKey + "\"" +
                "}";

        // Send POST request 
        sshKeyId = given()
                .spec(requestSpec1)
                .body(requestBody)
                .when()
                .post("/user/keys")
                .then()
                .statusCode(201) // for 201
                .body("key", equalTo(sshKey))
                .extract()
                .path("id"); 

        System.out.println("SSH Key added with ID: " + sshKeyId);
    }

    @Test(dependsOnMethods = "testAddSSHKey")
    public void testGetSSHKeys() {
        // Send GET request 
        given()
                .spec(requestSpec1)
                .when()
                .get("/user/keys")
                .then()
                .statusCode(200) // Expecting 200 
                .body("id", hasItem(sshKeyId)); // Verify the added SSH key ID is present

        System.out.println("SSH Key with ID " + sshKeyId + " is present in the list.");
    }

    @Test(dependsOnMethods = "testGetSSHKeys")
    public void testDeleteSSHKey() {
        // Send DELETE request 
        given()
                .spec(requestSpec1)
                .when()
                .delete("/user/keys/" + sshKeyId)
                .then()
                .statusCode(204); // Expecting 204 

        System.out.println("SSH Key with ID " + sshKeyId + " has been deleted.");
    }
}
	

