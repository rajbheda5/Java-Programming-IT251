import java.util.Arrays;

public class common {
    public static void main(String[] args){
        int[] array1 = {2, 4, 6, 8, 10, 12};
        int[] array2 = {3, 6, 9, 12, 15, 18};
        System.out.printf("Array 1: " + Arrays.toString(array1));
        System.out.printf("\nArray 2: " + Arrays.toString(array2));

        System.out.println("\nCommon elements are:");

        for (int i = 0; i < array1.length; i++){
            for(int j = 0; j< array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
