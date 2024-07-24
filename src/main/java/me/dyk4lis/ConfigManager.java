package me.dyk4lis;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@JsonIgnoreProperties
public class ConfigManager {
    private ObjectMapper objectMapper = new ObjectMapper();
    private static ConfigManager instance;
    @Getter
    private ConfigDTO configDTO;

    private ConfigManager() {
        loadConfig();
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    @SneakyThrows
    private void loadConfig() {

        List<String> list = Files.readAllLines(Path.of("C:\\Users\\dyk4l\\cryptorigbot\\src\\main\\resources\\config.json"));

        String json = String.join("", list);


        configDTO = objectMapper.readValue(json, ConfigDTO.class);
    }


}
