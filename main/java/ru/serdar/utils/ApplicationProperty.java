package ru.serdar.utils;

import java.io.*;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Lena
 * Date: 30.10.13
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */
public  class ApplicationProperty {
    public static void main(String ... arg){
        Properties prop = ApplicationProperty.getInstance().getProperty();
        System.out.println(prop.getProperty("mask"));
    }
    private Properties prop = new Properties();
    private ApplicationProperty(){
        try{
            String path = Property.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"/main/properties/";
            System.out.println(path+"config.properties");
            File f = new File(path+"config.properties");
            if(f.exists()) {
                prop.load(new FileInputStream(path+"config.properties"));
            }
        }catch (Exception ex){
            //log exception
        }
    }

    public static class Property{
        public static final ApplicationProperty instance = new ApplicationProperty();
    }

    public static ApplicationProperty getInstance()  {
        return Property.instance;
    }
    public Properties getProperty(){
         return prop;
    }
    public void saveProperty() throws IOException {
        prop.store(new FileOutputStream("config.properties"), null);
    }

}
