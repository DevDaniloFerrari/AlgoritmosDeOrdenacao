package sorting.tests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;
import sorting.algorithms.BubbleSort;
import sorting.algorithms.CountSort;
import sorting.algorithms.HeapSort;
import sorting.algorithms.InsertionSort;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortTests {

    int[] elementosOrdenados = {0,1,2,3,4,5,6,7,8,9,10};
    int[] elementosDesordenados = {3,9,4,0,1,10,8,7,5,6,2};

    BubbleSort bubbleSort;
    InsertionSort insertionSort;
    HeapSort heapSort;
    CountSort countSort;

    @BeforeAll
    public void inicializarTest(){
        bubbleSort = new BubbleSort();
        insertionSort = new InsertionSort();
        heapSort = new HeapSort();
        countSort = new CountSort();
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
}
