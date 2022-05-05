
package config;
import org.aeonbits.owner.Config;

    @Config.Sources("classpath:config/credentials.properties")
    public interface CredentialsConfig extends Config {
        String login();
        String password();
        String browserSize();
        String holdBrowserOpen();
        String BASE_URL();

        String selenoidLogin();
        String selenoidPassword();
        String selenoidUrl();
        String selenoidParsedUrl();
        String selenoid_server();
    }

