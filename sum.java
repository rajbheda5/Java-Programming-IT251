public class sum {
    public static void main(String[] args){
        int[] array = new int[]{2,4,6,8,10};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array elements : " + sum);
    }
}
