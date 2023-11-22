
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import binary.Binary;

public class Binary1 {
    
    public Binary1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   @Test
    public void testBinarySearchExistingNum() {
        int[] array = {2,5,7,9,13,15,18,10,23,45};
        int target = 9;

        int index = Binary.binarySearch(array, target);
        assertEquals(5, index);
    }

    @Test
    public void testBinarySearchNonExistingNum() {
        int[] array = {9,3,5,7,6,1,12,13,19,30};
        int target = 60;

        int index = Binary.binarySearch(array, target);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearchEmptyNum() {
        int[] array = {};
        int target = 6;

        int index = Binary.binarySearch(array, target);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearchFirstNum() {
        int[] array = {10,20,30,40,50,60,70,80,90,12};
        int target = 10;

        int index = Binary.binarySearch(array, target);
        assertEquals(0, index);
    }

    @Test
    public void testBinarySearchLastNum() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;

        int index = Binary.binarySearch(array, target);
        assertEquals(9, index);
    }
}

