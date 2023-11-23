package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends IMappable>{
    private List<T> mappables = new ArrayList<>();

    public void renderLayer() {
        for(T t: mappables) {
            System.out.println(t.render());
        }
    }

    public void addMappable(T t) {
        mappables.add(t);
    }

    public void addMappables(List<T> t) {
        mappables.addAll(t);
    }
}
