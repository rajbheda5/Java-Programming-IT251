import java.util.Scanner;

public class remove {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,3,4};
        System.out.println("Given Array: ");
        for(int i=0; i<array.length; i++){
            if(i == array.length -1 )
                System.out.println(array[i]+"");
            else
                System.out.println(array[i] + ", ");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter position of element to be deleted: ");
        int rem = in.nextInt();
        for(int i = 0; i < array.length; i++){
            if(i == rem){
                for (int j = i; j < array.length -1; j++){
                    array[j] = array [j+1];
                }
            }
        }
        System.out.println("New Array: ");
        for(int i=0; i<array.length -1; i++){
            if(i == array.length -2 )
                System.out.println(array[i]+"");
            else
                System.out.println(array[i] + ", ");
        }
    }
}
