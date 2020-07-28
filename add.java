import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int l, p, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        l = sc.nextInt();
        int arr[] = new int[l+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position number:");
        p = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        e = sc.nextInt();
        for(int i = l-1; i >= (p-1); i--){
            arr[i+1] = arr[i];
        }
        arr[p-1] = e;
        System.out.print("After inserting the array is: ");
        for(int i = 0; i <=l; i++){
            System.out.print(arr[i]+",");
        }
    }
}
