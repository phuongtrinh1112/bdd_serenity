package common_keywords;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CommonKeywords {

    //Read properties file
    public static HashMap readPropertiesFile(String filePath){
        HashMap propertiesDic = new HashMap();
        Properties prop = new Properties();
        File file = null;
        InputStream input = null;
        try {
            file = new File(filePath);
            input = new FileInputStream(file);
            prop.load(input);
            prop.putAll(propertiesDic);
            for (Map.Entry<Object, Object> entry : prop.entrySet()){
                propertiesDic.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertiesDic;
    }

}
