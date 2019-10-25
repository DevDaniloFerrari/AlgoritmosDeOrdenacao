package analyse;

import sorting.algorithms.*;
import sorting.interfaces.ISort;

public class Report {
    ExecutionData executionData;

    public String run(){
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        HeapSort heapSort = new HeapSort();
        CountSort countSort = new CountSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        BucketSort bucketSort = new BucketSort();
        RadixSort radixSort = new RadixSort();

        executionData = this.generateExecutionDate();

        String finalResult = run(bubbleSort) + "\n" +
                run(insertionSort) + "\n" +
                run(heapSort) + "\n" +
                run(countSort) + "\n" +
                run(selectionSort) + "\n" +
                run(quickSort) + "\n" +
                run(mergeSort) + "\n" +
                run(bucketSort) + "\n" +
                run(radixSort);


        return finalResult;
    }

    private String run(ISort sortAlgorithm){
        String result;
        Timer timer = new Timer(sortAlgorithm);
        ExecutionResult executionResult = timer.execute(executionData);
        result = sortAlgorithm.getClass().getSimpleName() + "\n" + executionResult.print();
        return result;
    }

    private ExecutionData generateExecutionDate(){
        ExecutionData executionData = new ExecutionData();
        ArrayGenerator arrayGenerator = new ArrayGenerator();

        executionData.OneHundred = arrayGenerator.randomGenerate(100);
        executionData.OneThousand = arrayGenerator.randomGenerate(1000);
        executionData.TenThousand = arrayGenerator.randomGenerate(10000);
        executionData.HundredThousand = arrayGenerator.randomGenerate(100000);
        executionData.OneMillion = arrayGenerator.randomGenerate(1000000);

        return executionData;
    }
}
