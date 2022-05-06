package properties;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTests {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void loginTest() {
        String login = config.login();
        String password = config.password();
        String selenoidLogin = config.selenoidLogin();
        String selenoidPassword = config.selenoidPassword();
        String selenoid_server = config.selenoid_server() ;
        String  base_url = config.base_url();

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);

        String message = "I logged in as " + login + " with password " + password;


    }
}
