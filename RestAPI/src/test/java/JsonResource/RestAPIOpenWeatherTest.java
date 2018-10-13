package JsonResource;
import RestAPI.RestAPIOpenWeather;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class RestAPIOpenWeatherTest extends RestAPIOpenWeather {
        @Test
        public void testResponseCode(){
            responseCode();
        }
        @Test
        public void testResponseTime(){
            responseTime();
        }
        @Test
        public void testResponseCity(){
            responseCity();
        }
        @Test
        public void testResponseID(){
            responseID();
        }

    }

