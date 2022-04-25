package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

    public static Properties getTestProperties() {

        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("src/test/resources/test.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }

    public static String getProperty(String property) {
        return TestProperties.getTestProperties().getProperty(property);
    }
}
