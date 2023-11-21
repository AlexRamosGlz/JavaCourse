package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mappable> places = new ArrayList<>();

        places.add(new Building("Teatro Diana", UsageType.ENTERTAINMENT));
        places.add(new Building("Palacio de Gobierno", UsageType.GOVERNMENT));
        places.add(new Building("Unidad Deportiva Tabachines", UsageType.SPORTS));

        places.add(new UtilityLine("Internet", UtilityType.FIBER_OPTIC));
        places.add(new UtilityLine("Gas Tomsa", UtilityType.ELECTRICAL));


        for (Mappable place: places) {
            Mappable.mapIt(place);
        }
    }
}
