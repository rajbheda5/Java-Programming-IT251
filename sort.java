import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        //numeric array sorting
        Integer[] numArray = {10, 50, 40, 20, 60, 30, 80, 100, 90, 70};
        System.out.printf("Original Numeric Array: ");
        for(int i=0; i<numArray.length; i++){
            if(i == numArray.length -1 )
                System.out.printf(numArray[i]+"");
            else
                System.out.printf(numArray[i] + ", ");
        }
        for (int i = 0; i < numArray.length; i++){
            for (int j = i+1; j < numArray.length; j++){
                int tmp = 0;
                if(numArray[i]>numArray[j]){
                    tmp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tmp;
                }
            }
        }
        System.out.printf("\nSorted Numeric Array: ");
        for(int i=0; i<numArray.length; i++){
            if(i == numArray.length -1 )
                System.out.printf(numArray[i]+"\n\n");
            else
                System.out.printf(numArray[i] + ", ");
        }

        //string array sorting
        String[] strArray = {"Elephant", "Cat", "Lion", "Dog", "Tiger"};
        System.out.printf("Original String Array: ");
        for(int i=0; i<strArray.length; i++){
            if(i == strArray.length -1 )
                System.out.printf(strArray[i]+"");
            else
                System.out.printf(strArray[i] + ", ");
        }
        for(int i = 0; i < strArray.length ; i++){
            for(int j = i+1; j < strArray.length ; j++){
                if(strArray[i].compareTo(strArray[j]) > 0){
                    String tmp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = tmp;
                }
            }
        }

        System.out.printf("\nSorted String Array: ");
        for(int i=0; i<strArray.length; i++){
            if(i == strArray.length -1 )
                System.out.printf(strArray[i]+"");
            else
                System.out.printf(strArray[i] + ", ");
        }
    }
}
