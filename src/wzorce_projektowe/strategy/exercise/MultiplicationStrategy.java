package wzorce_projektowe.strategy.exercise;

public class MultiplicationStrategy implements OperationStrategy{
    @Override
    public void mathematicalOperation(int x, int y) {
        System.out.println(x*y);
    }
}