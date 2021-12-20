package data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserData {

    static Object userObject;

    static {
        try {
            userObject = new JsonParser().parse(new FileReader("src/test/resources/users.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static JsonObject user = (JsonObject) userObject;


    static String email = user.get("email").getAsString();
    static String username = user.get("username").getAsString();
    static String password = user.get("password").getAsString();

    public static String getEmail() {
        return email;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static JsonObject getUser() {
        return user;
    }

}
