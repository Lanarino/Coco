package framework.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesWorker {
    public static String getConfigProperties(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("config.properties");
            prop.load(input);
            prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static String getTestProperties(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("testData.properties");
            prop.load(input);
            prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
