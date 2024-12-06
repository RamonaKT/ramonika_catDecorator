public class CatDecoratorDemo {
    public static void main(String[] args) {
        // Basis-Katze
        Cat simpleCat = new BaseCat();
        System.out.println(simpleCat.getDescription() + " | Kosten: " + simpleCat.getCost() + "€");

        // Katze mit Farbe
        Cat coloredCat = new ColorDecorator(simpleCat, "Schwarz");
        System.out.println(coloredCat.getDescription() + " | Kosten: " + coloredCat.getCost() + "€");

        // Katze mit Farbe und Accessoire
        Cat fancyCat = new AccessoryDecorator(coloredCat, "Schleife");
        System.out.println(fancyCat.getDescription() + " | Kosten: " + fancyCat.getCost() + "€");

        // Noch ein Accessoire hinzufügen
        Cat fullyDecoratedCat = new AccessoryDecorator(fancyCat, "Sonnenbrille");
        System.out.println(fullyDecoratedCat.getDescription() + " | Kosten: " + fullyDecoratedCat.getCost() + "€");
    }
}

