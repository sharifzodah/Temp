public class VarArgsTasks {


    public static void main(String[] args) {

        System.out.println(getAverage("Malika", 20, 50, 80, 100, 90));

        String name = "Andrea";
        int [] grades = {90, 50, 70, 78, 66};
        System.out.println(getAverage(name, grades));

        VarArgsTasks vat = new VarArgsTasks();

        System.out.println(vat.getLength(grades));

        System.out.println(vat.getTotal(grades));

        System.out.println(vat.getAverage(grades));

    }

    public static int getAverage(String name, int... grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    int getTotal(int... nums){
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    int getLength(int... nums){
        return nums.length;
    }

    double getAverage(int... nums){
        return (double) getTotal(nums)/getLength(nums);
    }
}
