package com.dezxxx.javaDesignPatterns.creational.singleton;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static ConfigManager instance;
    private Properties properties;

    private ConfigManager() {
        loadProperties();
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private void loadProperties() {
        properties = new Properties();

        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config", e);
        }
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}