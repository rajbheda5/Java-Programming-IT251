import java.util.Arrays;

public class reverse {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        System.out.printf("Original order: " + Arrays.toString(array));
        int[] b = new int[7];
        int j = 7;
        for(int i = 0; i < 7 ; i++){
            b[j-1] = array[i];
            j--;
        }
        System.out.printf("\n\nReversed order: " + Arrays.toString(b));
    }
}
