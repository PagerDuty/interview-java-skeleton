import org.json.*;

/**
 * Library download link:
 *   https://repo1.maven.org/maven2/org/json/json/20180813/json-20180813.jar
 *
 * or dependency for Maven:
 *   <dependency>
 *     <groupId>org.json</groupId>
 *     <artifactId>json</artifactId>
 *     <version>20180813</version>
 *   </dependency>
 */
public class JsonExample {

    private static String JSON =
        "{\"name\": \"Alice\", \"friends\": [\"Bob\", \"Charlie\", \"Donna\"]}";

    public static void main(String[] args) {
        JSONObject obj = new JSONObject(JSON);

        String name = obj.getString("name");
        System.out.print(name + " has these friends: ");

        JSONArray arr = obj.getJSONArray("friends");
        for (int i = 0; i < arr.length(); i++) {
            System.out.print(arr.getString(i) + " ");
        }
    }
}
