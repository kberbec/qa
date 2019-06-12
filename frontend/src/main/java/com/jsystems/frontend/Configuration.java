package com.jsystems.frontend;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {
    private static final Config CONFIG = ConfigFactory.load("config.conf");
    private static final String ENVIRONMENT = CONFIG.getString ("environment");
    private static final Config ENV = CONFIG.getConfig("environments").getConfig(ENVIRONMENT);
    private static final String BROWSER = CONFIG.getString("browser");
    private static final String MACHINE = CONFIG.getString("machine");

    private static final String BASEURL = ENV.getString("baseUrl");
    private static final String LOGIN = ENV.getString("login");
    private static final String PASSWORD = ENV.getString("password");

    public static String getBrowser () {
        return BROWSER;
    }
    public static String getMachine () {
        return MACHINE;
    }
}
