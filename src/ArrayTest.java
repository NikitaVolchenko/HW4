import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void test() {

        Array array = new Array();

        int[] arr = {1, 2, 3};
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {5, 7, 9};
        int[] resArr = array.addArrays(arr, arr1);
        assertArrayEquals(arr2, resArr);

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] resArr1 = array.glueArrays(arr, arr1);
        assertArrayEquals(arr3, resArr1);

        int[] arr4 = {3, 1, 2};
        boolean check = array.compareArrays(arr, arr4);
        assertTrue(check);
        check = array.compareArrays(arr, arr1);
        assertFalse(check);

        int[] arr5 = {1, 2, 3, 4};
        int[] resArr2 = array.pushBack(arr, 4);
        assertArrayEquals(arr5, resArr2);

        int[] arr6 = {1, 2, 3, 5, 6};
        int[] resArr3 = array.remove(arr3, 4);
        assertArrayEquals(arr6, resArr3);
    }
}