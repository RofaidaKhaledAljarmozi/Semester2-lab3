public class Ex2 {
    //cloning an Integer array
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        int array2[]=new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2=array1.clone();

        }
        System.out.println("Cloning array is "+" "+array2);
    }
}
