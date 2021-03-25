package wzorce_projektowe.strategy.exercise;

public class OperationContext {
    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void mathematicalOperationCalculate(int x, int y) {
        operationStrategy.mathematicalOperation(x, y);
    }
}