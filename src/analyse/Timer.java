package analyse;

import sorting.interfaces.ISort;

import java.util.Date;

public class Timer {

    ISort _sortAlgorithm;

    public Timer(ISort sort){
        _sortAlgorithm = sort;
    }

    public ExecutionResult execute(ExecutionData executionData){
        return new ExecutionResult(
                calculate(executionData.OneHundred),
                calculate(executionData.OneThousand),
                calculate(executionData.TenThousand),
                calculate(executionData.HundredThousand),
                calculate(executionData.OneMillion)
        );
    }

    private double calculate(int[] elements){
        Date date = new Date();
        double initialExecution = date.getTime();

        _sortAlgorithm.ordenar(elements);

        double finalExecution = date.getTime();

        return finalExecution - initialExecution;
    }

}
