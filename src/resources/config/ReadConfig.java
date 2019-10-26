package resources.config;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Properties;

public class ReadConfig {

    public String key(String value) {

        Properties properties = this.getProperties();

        return properties.getProperty(value);

    }

    private Properties getProperties() {
        InputStream inputStream;
        Properties properties = new Properties();

        try {
            inputStream = ReadConfig.class.getResourceAsStream("config.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return properties;

    }
}
