package h2_1;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Config {
    private static Config config;

    private String color;
    private int weight;

    private Config() {
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
            config.loadConfig();
        }
        return config;
    }

    private void loadConfig() {
        try {
            JsonParser parser = new JsonParser();
            JsonObject obj = parser.parse(new FileReader("config.json")).getAsJsonObject();
            this.color = obj.get("color").getAsString();
            this.weight = obj.get("weight").getAsInt();
        } catch (FileNotFoundException e) {
           System.out.println(e);
        }
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}