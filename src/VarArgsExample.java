public class VarArgsExample {


    static int getTotal(int... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    static int getTotal(int[]... multiDimArray){
        int total = 0;

        for (int[] ints : multiDimArray) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 5, 6, 7};
        int [] arr2 = {1, 5, 6, 7};
        int n1 = 50;
        int n2 = 60;
        int n3 = 70;

        System.out.println(getTotal(arr1, arr2));
        System.out.println(getTotal(n1, n2, n3));
    }
}
