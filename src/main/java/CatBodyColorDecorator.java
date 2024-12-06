public class CatBodyColorDecorator extends CatDecorator {

    private String color;

    public CatBodyColorDecorator(CatClass decoratedCat, String color){
        super(decoratedCat);
        this.color = color;
    }
    @Override
    public void describe(){
        super.describe();
        System.out.println(" mit der Farbe " + color + ".");
    }
}
