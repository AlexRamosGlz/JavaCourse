package Interfaces.Challenge;

import java.util.Map;

public interface Mappable {
    String JSON_PROPERTY = """ 
            "properties":{%s}
            """;


    String getLabel();

    String getMarker();

    Geometry getShape();

    default String toJSON() {

        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable map) {
        System.out.println(JSON_PROPERTY.formatted(map.toJSON()));
    }

}
