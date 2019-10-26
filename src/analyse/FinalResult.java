package analyse;

import java.util.ArrayList;

public class FinalResult {
    private ArrayList<ExecutionResult> BubbleSortResult;
    private ArrayList<ExecutionResult> InsertionSortResult;
    private ArrayList<ExecutionResult> HeapSortResult;
    private ArrayList<ExecutionResult> CountSortResult;
    private ArrayList<ExecutionResult> SelectionSortResult;
    private ArrayList<ExecutionResult> QuickSortResult;
    private ArrayList<ExecutionResult> MergeSortResult;
    private ArrayList<ExecutionResult> BucketSortResult;
    private ArrayList<ExecutionResult> RadixSortResult;

    public FinalResult() {
        BubbleSortResult = new ArrayList<>();
        InsertionSortResult = new ArrayList<>();
        HeapSortResult = new ArrayList<>();
        CountSortResult = new ArrayList<>();
        SelectionSortResult = new ArrayList<>();
        QuickSortResult = new ArrayList<>();
        MergeSortResult = new ArrayList<>();
        BucketSortResult = new ArrayList<>();
        RadixSortResult = new ArrayList<>();
    }

    public ExecutionResult generateAverageResult(ArrayList<ExecutionResult> executionResult){
        int divider = executionResult.size();

        long OneHundredAverage = 0;
        long OneThousandAverage = 0;
        long TenThousandAverage = 0;
        long HundredThousandAverage = 0;
        long OneMillionAverage = 0;

        for (ExecutionResult result: executionResult) {
            OneHundredAverage += result.getOneHundred();
            OneThousandAverage += result.getOneThousand();
            TenThousandAverage += result.getTenThousand();
            HundredThousandAverage += result.getHundredThousand();
            OneMillionAverage += result.getOneMillion();
        }

        return new ExecutionResult(OneHundredAverage
                , OneThousandAverage
                , TenThousandAverage
                , HundredThousandAverage
                , OneMillionAverage);
    }

    public ArrayList<ExecutionResult> getBubbleSortResult() {
        return BubbleSortResult;
    }

    public ArrayList<ExecutionResult> getInsertionSortResult() {
        return InsertionSortResult;
    }

    public ArrayList<ExecutionResult> getHeapSortResult() {
        return HeapSortResult;
    }

    public ArrayList<ExecutionResult> getCountSortResult() {
        return CountSortResult;
    }

    public ArrayList<ExecutionResult> getSelectionSortResult() {
        return SelectionSortResult;
    }

    public ArrayList<ExecutionResult> getQuickSortResult() {
        return QuickSortResult;
    }

    public ArrayList<ExecutionResult> getMergeSortResult() {
        return MergeSortResult;
    }

    public ArrayList<ExecutionResult> getBucketSortResult() {
        return BucketSortResult;
    }

    public ArrayList<ExecutionResult> getRadixSortResult() {
        return RadixSortResult;
    }

    public void addBubbleSortResult(ExecutionResult executionResult) {
        BubbleSortResult.add(executionResult);
    }

    public void addInsertionSortResult(ExecutionResult executionResult) {
        InsertionSortResult.add(executionResult);
    }

    public void addHeapSortResult(ExecutionResult executionResult) {
        HeapSortResult.add(executionResult);
    }

    public void addCountSortResult(ExecutionResult executionResult) {
        CountSortResult.add(executionResult);
    }

    public void addSelectionSortResult(ExecutionResult executionResult) {
        SelectionSortResult.add(executionResult);
    }

    public void addQuickSortResult(ExecutionResult executionResult){
        QuickSortResult.add(executionResult);
    }

    public void addMergeSortResult(ExecutionResult executionResult){
        MergeSortResult.add(executionResult);
    }

    public void addBucketSortResult(ExecutionResult executionResult){
        BucketSortResult.add(executionResult);
    }

    public void addRadixSortResult(ExecutionResult executionResult){
        RadixSortResult.add(executionResult);
    }
}
