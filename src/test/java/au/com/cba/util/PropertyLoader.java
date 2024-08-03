package au.com.cba.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private Properties prop = new Properties();

    public PropertyLoader() {
        try {
            File envConfigFile = new File(getClass().getClassLoader().getResource("environment.properties").getFile());
            FileInputStream fileInput = new FileInputStream(envConfigFile);
            prop.load(fileInput);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getEnvValue(){
        return prop.getProperty("Environment");
    }
    public String getProperty(String key){
        return  prop.getProperty(key);
    }
}
