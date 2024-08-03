package au.com.cba.Page;

import au.com.cba.steps.BaseSteps;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.net.UnknownHostException;

import static org.testng.Assert.assertEquals;

public class PetSorePage extends BaseSteps {

    public static Response response = null;
    private static RequestSpecification request;

    public static void FindPetByPetID(String id) {
        try {
            request = RestAssured.with();
            request.given()
                    .when();
            response = request.get(prop.getProperty("BaseURI") + prop.getProperty("PET_BY_ID") + id);
            int statusCode = response.getStatusCode();
            if (statusCode == 200) {
                Assert.assertEquals(statusCode, HttpStatus.SC_OK);
                System.out.println(response.then()
                        .log().all());
            } else if (statusCode == 422) {
                Assert.assertEquals(statusCode, HttpStatus.SC_UNPROCESSABLE_ENTITY);
                System.out.println(response.then()
                        .log().all());
            } else {
                System.out.println(response.then()
                        .log().all());
                assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Unexpected status code");
            }
            throw new UnknownHostException();
        } catch (UnknownHostException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    public static void FindPetByPetStatus(String status) {
        try {
            request = RestAssured.with();
            request.given()
                    .when();
            response = request.get(prop.getProperty("BaseURI") + prop.getProperty("PET_BY_STATUS") + status);
            int statusCode = response.getStatusCode();
            if (statusCode == 200) {
                Assert.assertEquals(statusCode, HttpStatus.SC_OK);
                System.out.println(response.then()
                        .log().all());
            } else if (statusCode == 422) {
                Assert.assertEquals(statusCode, HttpStatus.SC_UNPROCESSABLE_ENTITY);
                System.out.println(response.then()
                        .log().all());
            } else {
                System.out.println(response.then()
                        .log().all());
                assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Unexpected status code");
            }
            throw new UnknownHostException();
        } catch (UnknownHostException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    public static void DeletePetByPetID(String id) {
        try {
            request = RestAssured.with();
            request.given()
                    .when();
            response = request.delete(prop.getProperty("BaseURI") + prop.getProperty("DELETE_PET") + id);
            int statusCode = response.getStatusCode();
            if (statusCode == 200) {
                Assert.assertEquals(statusCode, HttpStatus.SC_OK);
                System.out.println(response.then()
                        .log().all());
            } else if (statusCode == 422) {
                Assert.assertEquals(statusCode, HttpStatus.SC_UNPROCESSABLE_ENTITY);
                System.out.println(response.then()
                        .log().all());
            } else {
                System.out.println(response.then()
                        .log().all());
                assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Unexpected status code");
            }
            throw new UnknownHostException();
        } catch (UnknownHostException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    public static void AddPet(String id, String name, String photoUrls, String status) {
        try {
            String jsonBody = String.format("{\"id\":" + id + ",\"category\":{\"id\":" + id + ",\"name\":\"" + name + "\"},\"name\":\"" + name + "\",\"photoUrls\":[\"" + photoUrls + "\"],\"tags\":[{\"id\":" + id + ",\"name\":\"" + name + "\"}],\"status\":\"" + status + "\"}");
            request = RestAssured.with();
            request.given()
                    .when().headers("Content-Type", "application/json")
                    .headers("Accept", "application/json")
                    .body(jsonBody);
            response = request.post(prop.getProperty("BaseURI") + prop.getProperty("ADD_PET"));
            int statusCode = response.getStatusCode();
            if (statusCode == 200) {
                Assert.assertEquals(statusCode, HttpStatus.SC_OK);
                System.out.println(response.then()
                        .log().all());
            } else if (statusCode == 422) {
                Assert.assertEquals(statusCode, HttpStatus.SC_UNPROCESSABLE_ENTITY);
                System.out.println(response.then()
                        .log().all());
            } else {
                System.out.println(response.then()
                        .log().all());
                assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Unexpected status code");
            }
            throw new UnknownHostException();
        } catch (UnknownHostException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

}