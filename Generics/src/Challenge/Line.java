package Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract  class Line implements IMappable{

    private List<List<Double>> locations = new ArrayList<>();

    public Line(List<List<Double>> locations) {
        this.locations = locations;
    }

    private String location() {
        return Arrays.deepToString(List.of(locations).toArray());
    }
    @Override
    public String render() {
        return location();
    }
}
