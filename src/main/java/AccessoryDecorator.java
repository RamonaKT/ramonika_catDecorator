public class AccessoryDecorator extends CatDecorator {
    private String accessory;

    public AccessoryDecorator(Cat decoratedCat, String accessory) {
        super(decoratedCat);
        this.accessory = accessory;
    }

    @Override
    public String getDescription() {
        return decoratedCat.getDescription() + ", mit Accessoire: " + accessory;
    }

    @Override
    public double getCost() {
        return decoratedCat.getCost() + 5.0; // Accessoires kosten zusätzlich
    }
}