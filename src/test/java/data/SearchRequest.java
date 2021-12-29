package data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SearchRequest {

    static Object requestObject;

    static {
        try {
            requestObject = new JsonParser().parse(new FileReader("src/test/resources/searchRequest.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static JsonObject searchRequest = (JsonObject) requestObject;


    static String request = searchRequest.get("request").getAsString();

    public static String getRequest() {
        return request;
    }

}
