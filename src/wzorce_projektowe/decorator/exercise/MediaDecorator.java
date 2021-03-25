package wzorce_projektowe.decorator.exercise;

public abstract class MediaDecorator implements Product{
    protected Product product;

    public MediaDecorator(Product product) {
        this.product = product;
    }
}