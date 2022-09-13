import java.util.Arrays;
import java.util.Random;

public class _2DArray {

    public static void main(String[] args) {

        String [] names = {"Michael", "John", "Jim"};
        String [] lastNames = {"Jordan", "Travolta", "Carry"};

        String [][] fullName = new String[2][];

        fullName[0] = names;
        fullName[1] = lastNames;

        for (int i = 0; i < fullName[0].length; i++) {
            System.out.println(fullName[0][i] + " " + fullName[1][i]);
        }


        String [][] allNames = {{"Michael", "John", "Jim"},{"Jordan", "Travolta", "Carry"} };

        for (int i = 0; i < allNames[0].length; i++) {
            for (int j = 0; j < allNames.length; j++) {
                System.out.print(allNames[j][i] + " ");
            }
            System.out.println();
        }


        int [][] numbers = new int[4][5];
        Random rnd = new Random();
        int [] totals = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int total = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                total += numbers[i][j] = rnd.nextInt(20);
            }
            totals[i] = total;
        }
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("totals = " + Arrays.toString(totals));
    }
}
