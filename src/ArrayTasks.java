public class ArrayTasks {

    public static void main(String[] args) {

        //Task1 Write a Java program to test if an array contains a specific value.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        int number = 1789;
        boolean hasNumber = false;

        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] == number){
                hasNumber = true;
            }
        }
        System.out.println("hasNumber = " + hasNumber);

        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        int total = 0;
        double avg = 0;
        for (int i = 0; i < numArr.length; i++) {
            total += numArr[i];
        }
        avg = (double) total/numArr.length;
        System.out.println("avg = " + avg);


    }
}
