// import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class sorting {
    
        public static void main(String[] args) {
    
            int array[] = { 5, 1, 5, 61, 56, 7 };
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
        
        
        @Test
        public void testEqual(){
            int expected[] = { 1, 5, 5, 7, 56, 61 };
            int array[] = { 5, 1, 5, 61, 56, 7 };
            assertNotEquals(expected, array);
            // Assert.assertEquals( expected, array );
            // assertArrayEquals("They are equal", sorting.selectionSort(new int[] {5, 1, 5, 61, 56, 7 }), expected);
        }
        @Test
        public void equals(){
            long x = 5;
            long y = 5;
            Assert.assertEquals(x, y);
            // assertEquals(x, y, "equal");
            // assertEquals(x, y, "messageSupplier");
            // assertEquals(x, y);
            // assertEquals(x, y, "message");
            // assertEquals(x, y, "messageSupplier");
        }
        
    }
