package sorting.tests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;
import sorting.algorithms.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortTests {

    int[] elementosOrdenados = {0,1,2,3,4,5,6,7,8,9,10};
    int[] elementosDesordenados = {3,9,4,0,1,10,8,7,5,6,2};

    BubbleSort bubbleSort;
    InsertionSort insertionSort;
    HeapSort heapSort;
    CountSort countSort;
    SelectionSort selectionSort;
    QuickSort quickSort;
    MergeSort mergeSort;
    BucketSort bucketSort;
    RadixSort radixSort;

    @BeforeAll
    public void inicializarTest(){
        bubbleSort = new BubbleSort();
        insertionSort = new InsertionSort();
        heapSort = new HeapSort();
        countSort = new CountSort();
        selectionSort = new SelectionSort();
        quickSort = new QuickSort();
        mergeSort = new MergeSort();
        bucketSort = new BucketSort();
        radixSort = new RadixSort();
    }

    @Test
    public void bubbleSortTest(){
        Assert.assertEquals(elementosOrdenados, bubbleSort.ordenar(elementosDesordenados));
    }

    @Test
    public void insertionSortTest(){
        Assert.assertEquals(elementosOrdenados, insertionSort.ordenar(elementosDesordenados));
    }

    @Test
    public void heapSortTest(){
        Assert.assertEquals(elementosOrdenados, heapSort.ordenar(elementosDesordenados));
    }

    @Test
    public void countSortTest(){
        Assert.assertEquals(elementosOrdenados, countSort.ordenar(elementosDesordenados));
    }

    @Test
    public void selectionSortTest(){
        Assert.assertEquals(elementosOrdenados, selectionSort.ordenar(elementosDesordenados));
    }

    @Test
    public void quickSortTest(){
        Assert.assertEquals(elementosOrdenados, quickSort.ordenar(elementosDesordenados));
    }

    @Test
    public void mergeSort(){
        Assert.assertEquals(elementosOrdenados, mergeSort.ordenar(elementosDesordenados));
    }

    @Test
    public void bucketSort(){
        Assert.assertEquals(elementosOrdenados, bucketSort.ordenar(elementosDesordenados));
    }

    @Test
    public void radixSort(){
        Assert.assertEquals(elementosOrdenados, radixSort.ordenar(elementosDesordenados));
    }

}
