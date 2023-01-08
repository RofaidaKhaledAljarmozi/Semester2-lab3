import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []array={1,7,8,4,5,6,3,2,9};
        for(int i:array){
        System.out.println(i+"");
    }
        insetionSort(array);
        System.out.println(Arrays.toString(array));
}
    private static void insetionSort(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            int temp=array[i];
            int j=i-1;
            while (j>=0&&array[j]>temp){
                array[j+1]=array[j];
            j--;
    }
        array[j+1]=temp;

        }
}}