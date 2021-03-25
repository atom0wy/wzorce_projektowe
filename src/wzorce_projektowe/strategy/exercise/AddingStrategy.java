package wzorce_projektowe.strategy.exercise;

public class AddingStrategy implements OperationStrategy{
    @Override
    public void mathematicalOperation(int x, int y) {
        System.out.println(x+y);
    }
}