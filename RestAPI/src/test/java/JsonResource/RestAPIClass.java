package JsonResource;

import RestAPI.RestAPIClassMethods;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestAPIClass extends RestAPIClassMethods {
    @BeforeMethod
    public void init(){
        RestAPIClassMethods obj = new RestAPIClassMethods();
    }
    @Test
    public void postTest(){
        postMethod();
    }

   @Test
    public void putTest(){
        putMethod();
    }

    @Test
    public void deleteTest(){
        deleteMethod();
    }

    @Test
    public void putNullTest(){
        putNullMethod();
    }
}
