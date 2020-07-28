import java.util.Arrays;

public class common {
    public static void main(String[] args){
        String[] array1 = {"Java", "CPP", "CCP", "Kotlin", "Swift"};
        String[] array2 = {"JavaScript", "Java", "Dart", "Python"};
        System.out.printf("Array 1: " + Arrays.toString(array1));
        System.out.printf("\nArray 2: " + Arrays.toString(array2));

        System.out.println("\nCommon elements are:");

        for (int i = 0; i < array1.length; i++){
            for(int j = 0; j< array2.length; j++){
                if(array1[i].compareTo(array2[j]) == 0){
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
