package com.zuev.repositories.databaseimpl;

import java.util.Properties;

public final class PropertiesUtil {

    private static final Properties PROPERTIES = new Properties();

    static{
        loadProperties();
    }

    private PropertiesUtil(){

    }

    private static void loadProperties(){
        PropertiesUtil.class.getClassLoader().getResourceAsStream("properties/mysqldata.properties");
    }


}
