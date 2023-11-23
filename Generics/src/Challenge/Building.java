package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Building extends Point{

    private String name;
    public Building(String name, List<Double> location) {
        super(location);
        this.name = name;
    }

    @Override
    public String render() {
        return "Render" + name + " as Point" + " (" + super.render() + ")";
    }
}
