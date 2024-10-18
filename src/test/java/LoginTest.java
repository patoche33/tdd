import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.example.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginTest {


     @Test
     public void testLogibnrCreation() {
            Login login = new Login("john_doe", "password123");
            assertEquals("john_doe", login.getUsername());
            assertEquals("password123", login.getPassword());
     }

      @Test
      public void testLoginrCreationWithNullUsername() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Login(null, "password123");
            });
      }

    @Test
    public void testUserCreationWithNullPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Login("john_doe", null);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "john_doe, password123, john_doe",
            "jane_doe, password321, jane_doe"
    })
    public void testParameterizedLoginCreation(String username, String password, String expectedUsername) {
        Login user = new Login(username, password);
        assertEquals(expectedUsername, user.getUsername());
    }

    @Test
    public void testMatchers() {
        ;
        Login login = new Login("john_doe", "password123");
        assertThat(login.getUsername(), is("john_doe"));
        assertThat(login.getPassword(), is("password123"));
        assertThat(login.getUsername(), startsWith("j"));
        assertThat(login.getUsername(), endsWith("e"));
        assertThat(login.getPassword(), containsString("123"));


    }

    @Test
    public void testMatchersNumber() {
        int age=25;
        assertThat(age, greaterThanOrEqualTo(20));
        assertThat(age, allOf(greaterThanOrEqualTo(20), lessThanOrEqualTo(25)));

    }

    @Test
    public void testMatchersList() {
        List<String> fruits = Arrays.asList("pomme","poire", "banane", "orange");

        assertThat(fruits,hasItem("banane"));
        assertThat(fruits, hasSize(4));
        assertThat(fruits, hasItems("orange", "pomme"));
        assertThat(fruits, anything());
        assertThat(fruits,empty());
    }

}
