import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public class Test {
        public static int binarySearch(int[] data, int key){
            int start = 0;
            int end = data.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (key == data[mid]) {
                    return mid;
                }
                if (key < data[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }


        }

    public static void main(String args[]){
        int[] data= {50,127,130,150,170,910,1009};
        int key = 910;
        System.out.println(key+" is found at index: "+binarySearch(data, key));

    }
}