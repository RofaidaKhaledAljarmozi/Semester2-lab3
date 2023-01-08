import java.util.Arrays;

public class Ex4 {
    //Equivalence Testing with Arrays
    public static void main(String[] args) {
        int arrayA[]={1,2,3,4,5};
        for (int i = 0; i < arrayA.length; i++) {
            int arrayB[]={1,2,3,4,5,6,7};
            for (int j = 0; j < arrayB.length; j++) {

            }
            if (Arrays.equals(arrayA,arrayB))
            {
                System.out.println("Both arrays are equals ");
            }
            else System.out.println("They are not equals");
        }


    }
}
