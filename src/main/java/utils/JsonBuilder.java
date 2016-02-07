package utils;

import java.util.List;

/**
 * Created by Artem on 31.01.2016.
 */
public class JsonBuilder {
    private List<Type> field;

    public JsonBuilder with(List<Type> type){
        this.field = type;
        return this;
    }

    public String build() {
        for (Type name: field){
            return String.format("{ \"%s\":\"%s\"}", name.names, "custom_name");
        }
        return null;
    }
}
