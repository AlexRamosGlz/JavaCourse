package Challenge;

import java.util.List;

public class River extends Line{

    private String name;

    public River(List<List<Double>> locations, String name) {
        super(locations);
        this.name = name;
    }

    @Override
    public String render() {
        return "Render" + name + " as Line" + " (" + super.render() + ")";
    }
}
