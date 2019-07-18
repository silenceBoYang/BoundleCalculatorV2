package algorithm;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BoundleAlgorithmTest {
    private BoundleAlgorithm boundleAlgorithm;

    @Before
    public void setup() {
        boundleAlgorithm = new BoundleAlgorithm();
    }

    @Test
    public void testBundleCalculator1() {
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(5);
        newArray.add(10);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(10);
        resultArray.add(5);

        int number = 15;
        assertEquals(resultArray, boundleAlgorithm.getFilledBoundleList(number, newArray));
    }

    @Test
    public void testBundleCalculator2() {
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(5);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(5);
        resultArray.add(3);


        int number = 17;
        assertEquals(resultArray, boundleAlgorithm.getFilledBoundleList(number, newArray));
    }

    @Test
    public void testBundleCalculator3() {
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(5);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(9);


        int number = 18;
        assertEquals(resultArray, boundleAlgorithm.getFilledBoundleList(number, newArray));
    }

    @Test
    public void testBundleCalculator4() {
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(6);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(9);
        resultArray.add(9);

        int number = 27;
        assertEquals(resultArray, boundleAlgorithm.getFilledBoundleList(number, newArray));
    }

}