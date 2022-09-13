import java.util.Arrays;
import java.util.Random;

public class _2DArray_Task {

    /*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60
*/

    public static void main(String[] args) {
        Random rnd = new Random();

        int [][] n = new int[rnd.nextInt(3,5)][rnd.nextInt(3,5)];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = rnd.nextInt(10)*10;
            }
        }
//        System.out.println(Arrays.deepToString(n));

        for (int[] ints : n) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
        int [][] nFlip = new int[n[0].length][n.length];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                nFlip[j][i] = n[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(nFlip));
        for (int[] ints : nFlip) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
