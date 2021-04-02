package common_keywords;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class CommonKeywords {

    //Read properties file with Java properties
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

    //Read conf file with typesafe library - extend library
    public static HashMap readConfFile(String filePath){
        HashMap configDic = new HashMap();

        /*File file = null;
        InputStream input = null;
        try {
            file = new File(filePath);
            input = new FileInputStream(file);
            prop.load(input);
            // prop.putAll(propertiesDic);
            prop.forEach((key, value) -> propertiesDic.put(key, value));
            *//*for (Map.Entry<Object, Object> entry : prop.entrySet()){
                propertiesDic.put((String) entry.getKey(), (String) entry.getValue());
            }*//*
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertiesDic;*/

        Config conf = ConfigFactory.load(filePath);
        for(Map.Entry entry : conf.entrySet()){
            configDic.put((String) entry.getKey(), (String) entry.getValue());
        }
        return configDic;
    }

    //Reade Json file
    public HashMap readJsonFile(String filePath){
        File file = new File(filePath);
        Scanner sc;
        HashMap dictionary = new HashMap();
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String[] lineContent = sc.nextLine().split(":");
                dictionary.put(lineContent[0], lineContent[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dictionary;
    }

}
