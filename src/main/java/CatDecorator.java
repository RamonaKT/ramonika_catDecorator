public abstract class CatDecorator implements Cat {
    protected Cat decoratedCat;

    public CatDecorator(Cat decoratedCat) {
        this.decoratedCat = decoratedCat;
    }

    @Override
    public String getDescription() {
        return decoratedCat.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCat.getCost();
    }
}