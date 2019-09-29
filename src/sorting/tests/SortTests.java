//package sorting.tests;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.testng.Assert;
//import sorting.algorithms.BubbleSort;
//import sorting.algorithms.InsertionSort;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class SortTests {
//
//    int[] elementosOrdenados = {1,2,3,4,5,6,7,8,9,10};
//    int[] elementosDesordenados = {3,9,4,1,10,8,7,5,6,2};
//
//    BubbleSort bubbleSort;
//    InsertionSort insertionSort;
//
//    @BeforeAll
//    public void inicializarTest(){
//        bubbleSort = new BubbleSort();
//        insertionSort = new InsertionSort();
//    }
//
//    @Test
//    public void bubbleSortTest(){
//        Assert.assertEquals(elementosOrdenados, bubbleSort.ordenar(elementosDesordenados));
//    }
//
//    @Test
//    public void insertionSortTest(){
//        Assert.assertEquals(elementosOrdenados, insertionSort.ordenar(elementosDesordenados));
//    }
//}