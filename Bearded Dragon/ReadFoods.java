json parser (fao)

Update pom.xml with json-simple maven dependency.

pom.xml
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
package *;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONFAO
{
    JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("Foods.json"))
    {
        Object obj = jsonParser.parse(reader);//read the json file

        JSONArray foodList = (JSONArray) obj;
        System.out.println(foodList);

        foodList.forEach(food->parseFoodObject((JSONObject) food));

    } catch (FileNotFoundException f) {
        f.printStackTrace();
    } catch (IOException f) {
        f.printStackTrace();
    } catch (ParseException f) {
        f.printStackTrace();
    }

    private static void parseFoodObject(JSONObject foods)
    {
        JSONObject foodsObject = (JSONObject) food.get("food");

        String foodName = (String) foodList.get("foodName");    

        String foodRes = (String) foodList.get("foodRes");    

        String foodDate = (String) foodList.get("foodDate");    
    }
    
}