public class BaseCat implements Cat {
    @Override
    public String getDescription() {
        return "Eine einfache Katze";
    }

    @Override
    public double getCost() {
        return 10.0; // Basispreis der Katze
    }
}