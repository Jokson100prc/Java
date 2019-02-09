package adv1_jsonDemo;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Map;

public class JsonPWriter {
  public static void main(String[] args) {

    JsonBuilderFactory jsonBuilderFactory = Json.createBuilderFactory(Collections.emptyMap());
    JsonObject jsonObject =
            jsonBuilderFactory.createObjectBuilder()
                    .add("Heroes", jsonBuilderFactory.createArrayBuilder()
                    .add(jsonBuilderFactory.createObjectBuilder()
                                    .add("First name", "Last name")
                                    .add("Features", jsonBuilderFactory.createObjectBuilder()
                                            .add("Strenght", 16)
                                            .add("dextirity", 18)
                                            .add("Constitution", 12)
                                            .add("Wisdom", 15)
                                            .add("Inteligence", 15)
                                            .add("Charisma", 12)
                                            .build())
                                    .build())
                            .add(jsonBuilderFactory.createObjectBuilder()
                                    .add("First name", "Last name")
                                    .add("Features", jsonBuilderFactory.createObjectBuilder()
                                            .add("Strenght", 12)
                                            .add("dextirity", 12)
                                            .add("Constitution", 10)
                                            .add("Wisdom", 18)
                                            .add("Inteligence", 18)
                                            .add("Charisma", 16)
                                            .build())
                                    .build())
                            .build()
            ).build();
    Map<String, ?>  config = Collections.singletonMap(JsonGenerator.PRETTY_PRINTING, true);
    JsonWriterFactory jsonWriterFactory = Json.createWriterFactory(config);
    jsonWriterFactory.createWriter(System.out).write(jsonObject);
  }
}
