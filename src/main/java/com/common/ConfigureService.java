package com.common;

import java.io.IOException;
import java.util.*;

public class ConfigureService {
    private Map<String, String> configures;

    public ConfigureService(Map<String, String> configures) throws IOException {
        this.configures = configures;
    }

    public static ConfigureService configureServiceLoader(Properties properties) throws IOException {
        Map<String, String> configs = new HashMap<String, String>();

        for (Map.Entry<Object, Object> props : properties.entrySet()) {
            String key = String.valueOf(props.getKey());
            String value = String.valueOf(props.getValue());

            configs.put(key,value);
        }
        return new ConfigureService(configs);
    }

    public String getConfigure(String toggleName) {
        return configures.containsKey(toggleName)? configures.get(toggleName) : "";
    }
}
