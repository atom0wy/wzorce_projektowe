package wzorce_projektowe.decorator.exercise;

public class Phone extends MediaDecorator{
    public Phone(Product product) {
        super(product);
    }

    @Override
    public String description() {
        return product.description() + " telefon ";
    }
}