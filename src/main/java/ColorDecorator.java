public class ColorDecorator extends CatDecorator {
    private String color;

    public ColorDecorator(Cat decoratedCat, String color) {
        super(decoratedCat);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return decoratedCat.getDescription() + ", Farbe: " + color;
    }

    @Override
    public double getCost() {
        return decoratedCat.getCost(); // Keine zusätzlichen Kosten für Farbe
    }
}
