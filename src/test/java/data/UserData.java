package data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserData {

    static Object obj;

    static {
        try {
            obj = new JsonParser().parse(new FileReader("src/test/resources/users.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static JsonObject jo = (JsonObject) obj;

    static String email = String.valueOf(jo.get("email"));
    static String username = String.valueOf(jo.get("username"));
    static String password = String.valueOf(jo.get("password"));

    public static String getEmail() {
        return email;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
