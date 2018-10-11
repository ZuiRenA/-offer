public class MinArray {
    public int minNumberInRotateArray(int [] array) {

        if (array == null)
            return 0;

        int i = 0, j = array.length - 1, mid = 0;

        while (array[i] > array[j]){
            if (j - i == 1){
                mid = j;
                break;
            }

            mid = (i + j) / 2;

            if (array[i] == array[j] && array[j] == array[mid])
                return findInOrder(array, i, j);

            if (array[i] <= array[mid])
                i = mid;
            else if (array[mid] <= array[j])
                j = mid;
        }

        return array[mid];
    }

    private int findInOrder(int[] array, int i, int j) {
        int reslut = array[i];

        for (int a = i + 1; a <= j; a++){
            if (array[a] < reslut)
                reslut = array[a];
        }

        return reslut;
    }
}
