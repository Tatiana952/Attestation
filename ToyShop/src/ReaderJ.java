import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReaderJ {

    public JSONObject readJSON() throws IOException, ParseException {
        String path = "src\\Attributes.json";
        File file = new File(path);
        String pathF = file.getCanonicalPath().replaceAll("\\\\","\\\\\\\\");
        FileReader reader = null;
        try {
            reader = new FileReader(pathF);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

        return jsonObject;
    }
}
