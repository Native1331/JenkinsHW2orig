package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("systemProperties")
public class SystemPropertiesTest {

        @Test
        @Tag("test5")
        void someTest5() {
            System.setProperty("browser", "firefox");
            System.setProperty("browser", "opera");
            System.setProperty("browser", "chrome");
            String browser = System.getProperty("browser", "chrome");
            String version = System.getProperty("version", "100");
            System.setProperty("browserSize", "1920x1080");
            System.setProperty("browserSize", "1680x1050");
            System.setProperty("browserSize", "1600x900");
            String browserSize = System.getProperty("browserSize", "1920x1080");

            System.out.println(browser);
            System.out.println(version);
            System.out.println(browserSize);

        }
        @Test
        void someTest6() {
            System.out.println("Say something: " + System.getProperty("anyText"));

        }
    }


