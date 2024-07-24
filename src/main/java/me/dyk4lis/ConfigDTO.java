package me.dyk4lis;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ConfigDTO {

    @JsonProperty("config")
    private Config config;

    @JsonProperty("locale")
    private Locale locale;

    @Data
    public static class Config {
        @JsonProperty("token")
        private String token;
    }

    @Data
    public static class Locale {
        @JsonProperty("welcome_text")
        private String welcomeText;
    }
}
