public class SequentialSearch {
    public static void main(String[] args) {
        int array[]={1,4,3,2,9,8,7,6};
        int index=sequentailsearch(array,6);
        if (index!=-1)
            System.out.println("Element has found in index"+" "+index);
        else System.out.println("Element has not found");
    }

    private static int sequentailsearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
           if (array[i]==value)
               return i;

        }
    return -1;
}}

