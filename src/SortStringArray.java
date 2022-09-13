import java.lang.reflect.Array;
import java.util.Arrays;

public class SortStringArray {

    public static void main(String[] args) {
        String [] str = {"bcd", "abc", "aac", "aaa", "bax"};
        System.out.println(Arrays.toString(sortStringArray(str)));
    }

    public static String [] sortStringArray(String [] arr){

        int pointer = 0, counter, strIndex;
        strIndex = pointer+1;
        int i = 0;
        int charIndex = 0;
        String temp = "";

        while (pointer < arr.length-1 ){
            if (arr[pointer].length() == arr[strIndex].length()) {
                if (i == arr.length) {
                    i = ++pointer;
                }
                if (pointer == arr.length - 1) {
                    break;
                }
                if (arr[pointer].charAt(i) > arr[strIndex].charAt(i)) {
                    temp = arr[pointer];
                    arr[pointer] = arr[strIndex];
                    arr[strIndex] = temp;
                    strIndex++;
                } else if (arr[pointer].charAt(i) == arr[strIndex].charAt(i)) {
                    ++charIndex;
                }
            }
            i++;
        }








        return arr;
    }
}
