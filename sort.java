import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        //numeric array sorting
        Integer[] numArray = {10, 50, 40, 20, 60, 30, 80, 100, 90, 70};
        System.out.printf("Original Numeric Array: %s", Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.printf("\nSorted Numeric Array: %s\n\n", Arrays.toString(numArray));
        
        //string array sorting
        String[] strArray = {"Elephant", "Cat", "Lion", "Dog", "Tiger"};
        System.out.printf("Original String Array: %s", Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.printf("\nSorted String Array: %s", Arrays.toString(strArray));
    }
}
