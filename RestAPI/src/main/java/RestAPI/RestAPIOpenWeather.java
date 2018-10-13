package RestAPI;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.get;

public class RestAPIOpenWeather {
    public static String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
    public void responseCode(){
        int status=get(url).getStatusCode();
        Assert.assertEquals(status,200);
    }
    public void responseTime(){
        long time=get(url).getTime();
        Assert.assertTrue(time> 0.0);
    }
    public void responseCity(){
        JsonPath jsonPathEvaluator=get(url).jsonPath();
        String city=jsonPathEvaluator.get("name");
        Assert.assertEquals(city,"London");
    }
    public void responseID(){
        JsonPath jsonPathEvaluator=get(url).jsonPath();
        int id=jsonPathEvaluator.get("id");
        Assert.assertEquals(id,2643743);
    }
}
