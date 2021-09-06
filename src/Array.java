public class Array {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public int[] addArrays(int[] arr, int[] arr1) {

        if (arr.length != arr1.length) {
            return null;
        }

        int[] resArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[i] + arr1[i];
        }
        return resArr;
    }

    public int[] glueArrays(int[] arr, int[] arr1) {

        int[] res = new int[arr.length + arr1.length];

        int i;
        for (i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        for (int j = 0; j < arr1.length; j++) {
            res[i] = arr1[j];
            i++;
        }
        return res;
    }

    public boolean compareArrays(int[] arr, int[] arr1) {

        if (arr.length != arr1.length) {
            return false;
        }

        bubbleSort(arr);
        bubbleSort(arr1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] pushBack(int[] arr, int value) {

        int[] resArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[i];
        }
        resArr[arr.length] = value;
        return resArr;
    }

    public int[] remove(int[] arr, int value) {

        int[] resArr = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != value) {
                resArr[j] = arr[i];
                j++;
            }
        }
        return resArr;
    }
}
