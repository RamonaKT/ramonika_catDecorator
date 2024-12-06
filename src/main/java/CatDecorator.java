public class CatDecorator implements CatInterface{
    protected CatClass decoratedCat;

    public CatDecorator(CatClass decoratedCat){
        this.decoratedCat = decoratedCat;
    }

    @Override
    public void describe(){
        decoratedCat.describe();
    }

}
