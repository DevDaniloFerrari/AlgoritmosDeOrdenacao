package resources.config;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

    public String key(String value) {

        Properties properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return properties.getProperty(value);

    }
}
