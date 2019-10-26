package analyse;

import sorting.interfaces.ISort;

import java.time.Duration;
import java.time.Instant;

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

    private long calculate(int[] elements){
        System.out.println(" - With: " + elements.length + " elements");

        Instant start = Instant.now();

        _sortAlgorithm.ordenar(elements);

        Instant finish = Instant.now();

        long timeExecution = Duration.between(start,finish).toMillis();

        System.out.println(" - done!");

        return timeExecution;
    }

}
