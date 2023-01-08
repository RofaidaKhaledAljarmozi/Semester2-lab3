import java.util.Arrays;

public class Ex1 {
    //cloning an object array
    // Generic method to copy an object array from `source[]` to `dest[]`
    private static <T> void copyArray(T[] source, T[] dest) {
        System.arraycopy(source, 0, dest, 0, source.length);
    }

    // Program to copy an object array in Java
    public static void main(String[] args)
    {
        Integer[] source = { 1, 2, 3, 4, 5 };
        Integer[] dest = new Integer[source.length];

        copyArray(source, dest);

        if (Arrays.equals(source, dest)) {
            System.out.println("Copied successfully: " + Arrays.toString(dest));
        }
    }
}
