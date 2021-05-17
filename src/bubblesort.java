import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int array[] = { 5, 1, 5, 61, 56, 7 };
        int n = array.length;
        bubbleSort(array, n);
        System.out.println(Arrays.toString(array));

    }

    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

}
