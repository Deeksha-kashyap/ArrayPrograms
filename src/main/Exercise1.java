package main;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
       int[] array1={567,454,345,876,123,278,190};
       String[] array2={"java","python","C#","C programme","C sharp"};
        System.out.println("Original numeric array :"+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :"+Arrays.toString(array1));
        System.out.println("Original numeric array :"+ Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array :"+Arrays.toString(array2));
    }
}
