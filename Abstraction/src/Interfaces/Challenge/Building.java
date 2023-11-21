package Interfaces.Challenge;

public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building( String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case BUSINESS -> Color.BLUE + " " + PointMarker.CIRCLE;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.DIAMOND;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            case GOVERNMENT -> Color.RED + " " + PointMarker.SQUARE;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                 ,"name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
