import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {


    @Test
    void test1(){



        Response response = RestAssured.get("https://official-joke-api.appspot.com/random_joke");

        System.out.println("Response : "+response.asString());
        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Body :"+response.getBody().asString());
        System.out.println("Headers :"+response.getHeaders());
        System.out.println("Time taken :"+response.getTime());







    }





}
