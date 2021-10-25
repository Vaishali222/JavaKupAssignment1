package CoreJava.Q2;
import java.util.Arrays;

public class Q2 {
    public static void BinarySort(int[] array)
    {
        int j= 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0) {
                array[j++] = 0;
            }
        }

        for (int i = j; i < array.length; i++) {
            array[j++] = 1;
        }
    }

    public static void main (String[] args)
    {
        int[] array1 = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Array1 before sorting : "+Arrays.toString(array1));
        BinarySort(array1);
        System.out.println("Array1 after sorting : "+Arrays.toString(array1));

        int[] array2 = {  1, 1, 1, 0, 1, 0, 0, 1, 0, 1 };
        System.out.println("Array2 before sorting : "+Arrays.toString(array2));
        BinarySort(array2);
        System.out.println("Array2 array after sorting : "+Arrays.toString(array2));

    }
}
