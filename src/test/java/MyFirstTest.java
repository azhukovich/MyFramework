import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class MyFirstTest {
    @Test
    void testGetStatusCode() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/posts/1")
                .then()
                .statusCode(201)
                .body("userId", equalTo(1))
                .body("title",notNullValue());
    }
}
