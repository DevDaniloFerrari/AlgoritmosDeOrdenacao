package sorting.tests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;
import sorting.algorithms.BubbleSort;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortTests {

    int[] elementosOrdenados = {1,2,3,4,5,6,7,8,9,10};
    int[] elementosDesordenados = {3,9,4,1,10,8,7,5,6,2};

    BubbleSort bubbleSort;

    @BeforeAll
    public void inicializarTest(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSortTest(){
        Assert.assertEquals(elementosOrdenados, bubbleSort.ordenar(elementosDesordenados));
    }
}
