package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(1231.00);
        list.add(1231.44);

        List<List<Double>> dimensionalArray = new ArrayList<>();
        dimensionalArray.add(0, list);
        dimensionalArray.add(1, list);

        var ceti = new Building("CETI", list);
        var tabacho = new Building("Tabachos", list);

        Layer<Building> buildingLayer = new Layer();
        buildingLayer.addMappable(ceti);

        buildingLayer.renderLayer();

        var rioBravo = new River(dimensionalArray, "Rio Bravo");

        Layer<River> riverLayer = new Layer<>();
        riverLayer.addMappable(rioBravo);
        riverLayer.renderLayer();
    }
}
