package fileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {


    public String read(String Key) throws IOException, ParseException {
        JSONParser js = new JSONParser();
        FileReader file = new FileReader("");
        Object obj = js.parse(file);
        JSONObject json = (JSONObject) obj;
        String value = json.get(Key).toString();
        return value;
    }
}
