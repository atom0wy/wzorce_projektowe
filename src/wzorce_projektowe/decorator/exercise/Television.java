package wzorce_projektowe.decorator.exercise;

public class Television extends MediaDecorator{
    public Television(Product product) {
        super(product);
    }

    @Override
    public String description() {
        return product.description() +  " TV ";
    }
}
