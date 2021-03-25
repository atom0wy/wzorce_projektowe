package wzorce_projektowe.decorator.exercise;

public class Internet extends MediaDecorator{

    public Internet(Product product) {
        super(product);
    }

    @Override
    public String description() {
        return product.description() + " internet ";
    }
}