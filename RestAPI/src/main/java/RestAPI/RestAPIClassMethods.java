package RestAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;

public class RestAPIClassMethods {
    public void postMethod(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 2);
        jsonObject.put("title", "QA");
        jsonObject.put("author", "Abby");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://localhost:3000/profile");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(201, statusCode);
    }
    public void deleteMethod(){
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/profile");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }
    public void putMethod(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 2);
        jsonObject.put("title", "Engineer");
        jsonObject.put("author", "Abby");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/profile");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }
    public void putNullMethod(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 23);
        jsonObject.put("title", "CEO");
        jsonObject.put("author", "Becky");
        request.body(jsonObject.toJSONString());
        Response response = request.put("ttp://localhost:3000/profile");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(404, statusCode);
    }
}
