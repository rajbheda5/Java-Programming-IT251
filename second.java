public class second {
    public static void main(String[] args){
        Integer[] Array = {10, 50, 40, 20, 60, 30, 80, 100, 90, 70};
        System.out.println("Given Array: ");
        for(int i=0; i<Array.length; i++){
            if(i == Array.length -1 )
                System.out.println(Array[i]+"");
            else
                System.out.println(Array[i] + ", ");
        }
        for (int i = 0; i < Array.length; i++){
            for (int j = i+1; j < Array.length; j++) {
                int tmp = 0;
                if (Array[i] > Array[j]) {
                    tmp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = tmp;
                }
            }
        }
        int secondHighest = Array[Array.length-2];
        System.out.println("Second Highest element is: " +secondHighest);
    }
}
