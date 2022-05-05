package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("systemProperties")
public class SystemPropertiesTest {
           @Test
        void someTest1() {
            String browser = System.getProperty("browser");
            System.out.println(browser); // null
        }

        @Test
        void someTest2() {
            System.setProperty("browser", "safari");
            String browser = System.getProperty("browser");
            System.out.println(browser); // safari
        }

        @Test
        void someTest3() {
            String browser = System.getProperty("browser", "opera");
            System.out.println(browser); // opera
        }

        @Test
        void someTest4() {
            System.setProperty("browser", "safari");
            String browser = System.getProperty("browser", "opera");
            System.out.println(browser); // safari
        }

        @Test
        @Tag("test5")
        void someTest5() {
            String browser = System.getProperty("browser", "chrome");
            String version = System.getProperty("version", "100");
            String browserSize = System.getProperty("browserSize", "1920x1080");
            String base_url = System.getProperty("browser", "chrome");

            System.out.println(browser);
            System.out.println(version);
            System.out.println(browserSize);

        }
        @Test
        void someTest6() {
            System.out.println("Say something: " + System.getProperty("anyText"));

        }
    }


