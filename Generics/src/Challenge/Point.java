package Challenge;

import java.util.ArrayList;
import java.util.List;

public abstract class Point implements IMappable{
    private List<Double> location = new ArrayList<>();

    public Point(List<Double> location) {
        this.location = location;
    }

    private String location() {
        return location.toString();
    }

    @Override
    public String render() {
        return location();
    }
}
