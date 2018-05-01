
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class Test {

    @org.testng.annotations.Test
    public void Testy(){
        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                    assertThat().
                    header("content-length","4551").
                and().
                    assertThat().
                    header("connection","close").
                and().
                    assertThat().
                    header("server","Apache/2.2.15 (CentOS)").
                and().
                    assertThat().
                    header("x-powered-by","PHP/5.3.3").
                and().
                assertThat().
                    body("MRData.total",equalTo("20"));

        System.out.println(given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").toString());
    }
}
