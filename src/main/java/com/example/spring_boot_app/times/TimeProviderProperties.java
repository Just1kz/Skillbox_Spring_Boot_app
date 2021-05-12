package com.example.spring_boot_app.times;

import org.springframework.boot.context.properties.ConfigurationProperties;

//конфигурирование с помощью java класса
@ConfigurationProperties(prefix = "tprov")
public class TimeProviderProperties {

    private String profile;
    private String description;
    private String format;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
