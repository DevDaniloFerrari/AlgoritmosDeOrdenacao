package analyse;

import sorting.algorithms.*;
import sorting.interfaces.ISort;

import java.time.Duration;
import java.time.Instant;

public class Report {
    ExecutionData executionData;
    FinalResult finalResult;

    BubbleSort bubbleSort;
    InsertionSort insertionSort;
    HeapSort heapSort;
    CountSort countSort;
    SelectionSort selectionSort;
    QuickSort quickSort;
    MergeSort mergeSort;
    BucketSort bucketSort;
    RadixSort radixSort;

    public String run(int numberOfRepetitions) {
        bubbleSort = new BubbleSort();
        insertionSort = new InsertionSort();
        heapSort = new HeapSort();
        countSort = new CountSort();
        selectionSort = new SelectionSort();
        quickSort = new QuickSort();
        mergeSort = new MergeSort();
        bucketSort = new BucketSort();
        radixSort = new RadixSort();

        finalResult = new FinalResult();

        Instant start = Instant.now();

        for (int i = 0; i < numberOfRepetitions; i++) {
            System.out.println(i + 1 + "º execution!");
            executionData = this.generateExecutionDate();
            run(executionData);
        }

        Instant finish = Instant.now();

        long totalDurationTime = Duration.between(start,finish).toMinutes();

        String textResult = "\n\n*** EXECUTION RESULT ***\n\n";

        textResult += "BubbleSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getBubbleSortResult()).print() + "\n";
        textResult += "InsertionSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getInsertionSortResult()).print() + "\n";
        textResult += "HeapSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getHeapSortResult()).print() + "\n";
        textResult += "CountSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getCountSortResult()).print() + "\n";
        textResult += "SelectionSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getSelectionSortResult()).print() + "\n";
        textResult += "QuickSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getQuickSortResult()).print() + "\n";
        textResult += "MergeSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getMergeSortResult()).print() + "\n";
        textResult += "BucketSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getBucketSortResult()).print() + "\n";
        textResult += "RadixSort \n--------------\n" + finalResult.generateAverageResult(finalResult.getRadixSortResult()).print() + "\n";

        textResult += "Total duration time: " + totalDurationTime + " minutes";

        return textResult;
    }

    private void run(ExecutionData executionData) {
        finalResult.addBubbleSortResult(run(bubbleSort));
        finalResult.addInsertionSortResult(run(insertionSort));
        finalResult.addHeapSortResult(run(heapSort));
        finalResult.addCountSortResult(run(countSort));
        finalResult.addSelectionSortResult(run(selectionSort));
        finalResult.addQuickSortResult(run(quickSort));
        finalResult.addMergeSortResult(run(mergeSort));
        finalResult.addBucketSortResult(run(bucketSort));
        finalResult.addRadixSortResult(run(radixSort));
    }

    private ExecutionResult run(ISort sortAlgorithm) {
        System.out.println("Running: " + sortAlgorithm.getClass().getSimpleName());
        String result;
        Timer timer = new Timer(sortAlgorithm);
        ExecutionResult executionResult = timer.execute(executionData);
        return executionResult;
    }

    private ExecutionData generateExecutionDate() {
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
