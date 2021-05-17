import java.util.Arrays;

public class sorting {
    
        public static void main(String[] args) {
    
            int array[] = { 5, 1, 5, 61, 56, 7 };
            int expected[] = { 1, 5, 5, 7, 56, 61 };
            selectionSort(array);
            System.out.println(Arrays.toString(array));
    
        }
    
        public static void selectionSort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }
                // swapping
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }
        }
}
