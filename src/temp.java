import java.util.*;

public class temp {
    public static void main(String[] args) {
        int [] arr = {12, 8, 0, 50, 1, 1, -3};
        orderIntegerArray(arr);
    }

    public static String bubbleSort(int[] array) {

        if (array == null || array.length == 0) return "-";
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }

    public static String removeDuplicates(String[] array) {
        if (array == null || array.length == 0) return "-";

        List<String> list = Arrays.asList(array);

        return new LinkedHashSet<>(list).toString();
    }

    public static boolean isAnagram(String a, String b) {

        if (a.length() == 0 || b.length() == 0) return false;

        boolean result = false;
        char[] charA = a.replace(" ", "").toCharArray();
        char[] charB = b.replace(" ", "").toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);

        if (charA.length == charB.length) {
            for (int i = 0; i < charA.length; i++) {
                if (charA[i] == charB[i]) {
                    result = true;
                } else return false;
            }
        } else return false;

        return result;
    }

    public static double avgOfRandomSubarray(int[][] array) {

        if (array == null || array.length == 0) return -1;

        int index = new Random().nextInt(array.length) + 1;
        int result = 0;

        for (int j = 0; j < array[index - 1].length; j++) {
            result += array[index - 1][j];
        }
        return (double) result / (array[index - 1].length);
    }

    public static String encodeString(String input) {

        if (input == null || input.length() == 0) {
            return "-";
        }

        int counter = 1;
        char[] input_chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input_chars.length - 1; i++) {

            if (input_chars[i] == input_chars[i + 1]) {
                counter++;
                continue;
            } else {
                sb.append(counter).append(input_chars[i]);
            }
            counter = 1;
        }

        return sb.append(counter).append(input.charAt(input_chars.length - 1)).toString();
    }

    public static String reverseString(String input) {

        if (input == null || input.length() == 0) {
            return "-";
        }

        char[] char_input = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = input.toCharArray().length - 1; i >= 0; i--) {
            sb.append(char_input[i]);
        }

        return sb.toString();
    }

    public static String reverseAndEncodeString(String input) {

        if (input == null || input.length() == 0) {
            return "-";
        }

        String reversed_text = reverseString(input);

        return encodeString(reversed_text);
    }

    public static String reverseUsingSB(String input) {

        if (input == null || input.length() == 0) {
            return "-";
        }

        return new StringBuilder(input).reverse().toString();
    }

    public static String[] reorderLogFiles(String[] logs) {

        /*
        Example 1:
Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]

Constraints:
1.	0 <= logs.length <= 100
2.	3 <= logs[i].length <= 100
3.	logs[i] is guaranteed to have an identifier, and a word after the identifier.
        */
        TreeMap<String, String> set = new TreeMap<>();
        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            int index = log.indexOf(' ');
            char c = log.substring(index + 1).charAt(0);
            if (c >= 'a' && c <= 'z') {
                // Letter log
                // Build the key starting with 0, that ensures
                // letter-logs before digit-logs
                // Append id for a tiebreaker
                set.put("0 " + log.substring(index + 1) + " ", log);
            } else {
                // Digit log
                // Here also use the index as a char
                // to maintain lexicographic order
                set.put("1 " + (char) i + " ", log);
            }
        }

        int i = 0;
        for (String entry : set.values()) {
            logs[i] = entry;
            i++;
        }

        return logs;
    }

    public static boolean isStrobogrammatic(String num) {
        if (num == null || num.length() == 0) {
            return true;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            if (!map.containsKey(num.charAt(right)) || num.charAt(left) != map.get(num.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String reversList(String input) {

        if (input == null || input.length() == 0) return "-";

        List<Character> characterList = new ArrayList<>();

        for (char character : input.toCharArray()) {
            characterList.add(character);
        }
        Collections.reverse(characterList);

        Object[] list2 = characterList.toArray();
        String reverse = "";

        for (int i = 0; i < list2.length; i++) {

            reverse += list2[i];
        }

        return reverse;


    }

    public static long factorial(int number) {
        long factorial1 = 1;

        for (int i = 1; i <= number; i++) {
            factorial1 *= i;
        }
        return factorial1;
    }

    public static long factorialRecursion(int number) {

        if (number == 1) return 1;

        return number * factorialRecursion(number - 1);
    }

    public static int sumOfDigits(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int getArmstrongNumber(int number) {

        int sum = 0;
        int digit = 0;
        int temp = number;

        while (temp > 0) {

            digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        if (number != sum) return -1;

        return sum;
    }

    public static int fibonacciNumber(int number) {

        if (number <= 1) return number;

        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }

    public static int reversNumber(int number) {

        if (number == 0) return 0;

        StringBuilder result = new StringBuilder();
        while (number > 0) {

            result.append(number % 10);
            number /= 10;
        }

        return Integer.parseInt(result.toString());
    }

    public static int reverseNumbers(int number) {

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static int[] findOddNumbers(int[] numberArr) {

        int counter = 0;
        for (int i : numberArr) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        int[] oddNumbers = new int[counter];
        counter = 0;
        for (int i : numberArr) {
            if (i % 2 != 0) {
                oddNumbers[counter] = i;
                counter++;
            }
        }

        return oddNumbers;
    }

    public static String getTwoMaxValues(int[] array) {

        if (array == null || array.length == 0) return "-";
        else Arrays.sort(array);

        return Arrays.toString(new int[]{array[array.length - 1], array[array.length - 2]});
    }

    // function to check if paranthesis are balanced
    public static boolean areParanthesisBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    stack.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':
                    stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':
                    stack.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    public static String vowelAndConsonants(String text) {

        if (text == null || text.length() == 0) return "-";
        text = text.toLowerCase().trim();
        int vowelCount = 0;
        int consonantCount = 0;

        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> consonantList = new ArrayList<>();
        List<Character> vowelResultList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (!vowelList.contains(text.charAt(i))) {
                consonantList.add(text.charAt(i));
                consonantCount++;
            } else {
                vowelResultList.add(text.charAt(i));
                vowelCount++;
            }
        }
        return "Vowel list: " + vowelResultList + ", Count: " + vowelCount + "\n" +
                "Consonant list: " + consonantList + ", Count: " + consonantCount;
    }

    public static String removeExtraSpaces(String text) {

        if (text == null || text.length() == 0) return "-";

        StringBuilder sb = new StringBuilder();
        String temp = text.trim();
        text = temp;

        while (text.length() > 0) {

            for (int i = 0; i <= text.length(); i++) {
                if (!text.contains(" ")) {
                    sb.append(text);
                    text = text.replace(text, "");
                } else {
                    sb.append(text.substring(0, text.indexOf(' ') + 1));
                    temp = text.substring(text.indexOf(' ')).trim();
                    text = temp;
                }
            }
        }
        return sb.toString();
    }

    public static int findMissing(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        int diff = 0;

        if (nums.length == 1 && nums[0] == 0) {
            result = nums[0] + 1;
        } else if (nums.length == 1 && nums[0] > 0) {
            result = nums[0] - 1;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            diff = nums[i + 1] - nums[i];
            if (diff != 1) {
                result = nums[i] + 1;
                break;
            } else {
                result = nums[nums.length - 1] + 1;
            }
        }
        return result;
    }

    public static String[] orderStringArray(String[] array) {

        if (array == null || array.length == 0) return array;

        TreeSet<String> set = new TreeSet<>(Arrays.asList(array));
        List<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static int[] orderIntegerArray(int[] arr) {

        int pointer, i, temp;
        pointer = 0;
        i = 1;

        while (pointer < arr.length - 1) {
            if (i == arr.length) {
                i = ++pointer;
            }
            if (pointer == arr.length-1){
                break;
            }
            if (arr[pointer] > arr[i]) {
                temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
            }
            i++;
        }

        return arr;


//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j <= arr.length - 1; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//        return arr;
    }

    public static int[] sortIntegerArray(int[] arr) {

        int temp, i, marker;
        marker = 0;
        i = 1;

        while (marker < arr.length - 1) {
            if (i == arr.length) {
                marker++;
                i = marker;
            }
            if (arr[marker] > arr[i]) {
                temp = arr[marker];
                arr[marker] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
        return arr;
    }

    public static String[] sortStringArray(String[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) { //Apply the bubble Sort
                if (CompareString(array[j - 1], array[j]) == 1) { //Pass the two adjacent string for comparing
                    String temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    private static int CompareString(String first, String second) {
        int len;

        if (first.length() >= second.length()) //we need to take the smallest string length
            len = second.length();
        else
            len = first.length();

        for (int i = 0; i <= len; i++) {
            if (first.charAt(i) > second.charAt(i))  //Suppose the first string letters is greater then return 1;
                return 1;
            else if (first.charAt(i) < second.charAt(i)) //if second string letter is greater then return -1;
                return -1;
        }
        return 0;  //if both the equal then return 0
    }

    public static char [] sortChars(char [] chars){

        int marker = 0, i = 1;
        char temp = 0;

        while (marker < chars.length-1){
            if (i == chars.length){
                marker++;
                i = marker;
            }
            if (chars[marker] > chars[i]){
                temp = chars[marker];
                chars[marker] = chars[i];
                chars[i] = temp;
            }
            i++;
        }

        return chars;
    }

    public static String[] sortStringArr(String[] strArr) {
        char charBox = 0;
        String high = "";
        String low = "";
        String temp = "";

        for (int i = 1; i <= strArr.length - 1; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) < strArr[i - 1].charAt(j)) {

                    high = temp;
                    temp = strArr[i];
                    strArr[i] = strArr[i - 1];
                    strArr[i - 1] = temp;

                } else {
                    low = strArr[j];
                    temp = strArr[j + 1];

                }
                if (temp.charAt(j) < low.charAt(j)) {
                    high = low;
                    low = temp;
                    strArr[j] = low;
                    strArr[j + 1] = high;
                }
            }

//{"ddx", "bd", "ab", "b", "abc", "bbww", "ac"}
// {"dfs", "x", "ab", "llo", "abc", "bbww", "v"};

        }

        System.out.println(temp);
        return strArr;
    }

    public static String[] sortStringByLength(String[] arr) {
//"dfs", "x", "ab", "ll89o", "x", "bbww", "v"
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            int j = i - 1;

            while (j >= 0 && temp.length() < arr[j].length()) {
                arr[j + 1] = arr[j];
                j--;
            }
//           j++;
//           arr[j] = arr[j+1];
            arr[j + 1] = temp;


        }
//{"ddx", "bd", "ab", "b", "abc", "bbww", "ac"}
// {"dfs", "x", "ab", "llo", "abc", "bbww", "v"};

        return arr;
    }

    public static int sumOfArrayElements(int[] intArr) {

        int sum = 0;
        for (int value : intArr) {
            sum += value;
        }
        return sum;
    }

    public static boolean checkForNumber(int[] intArr, int num) {

        for (int value : intArr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }

    public static String targetedArraySum(int[] intArr, int target) {
// int [] arr = {1, 5, 8, 2, 4, 6}
        int[] coords = new int[2];
        for (int i = 0; i < intArr.length; i++) {

            int j = i + 1;
            int sum = 0;

            while (j >= 0 && j < intArr.length) {
                sum = intArr[i] + intArr[j];
                if (sum == target) {
                    coords[0] = i;
                    coords[1] = j;
                    System.out.println(Arrays.toString(coords));
                }
                j++;
            }
        }
        return "-------------";
    }

    public static String removeSpaces(String text) {

        return text = text.replace(" ", "");
    }

    public static int largestNumber(int[] nArr) {
// int [] arr = {1, 5, 8, 2, 4, 6}

        int j = 0;
        for (int i = 1; i <= nArr.length - 1; i++) {

            if (nArr[j] < nArr[i]) {
                j = i;
            } else {
                j = j;
            }
        }
        return nArr[j];
    }

    public static String pigLatinize(String phrase) {

        String[] strArr = phrase.split(" ");
        char[] initials = new char[strArr.length];
        String remainedTxt = "";
        String result = "";

        for (int i = 0; i < strArr.length; i++) {

            initials[i] = strArr[i].charAt(0);
            remainedTxt = strArr[i].substring(1);
            String temp = Character.toString(initials[i]);

            if (temp.matches("[AEIOUaeiou]")) {
                temp = temp + "way";
            } else {
                temp = temp + "ay";
            }

            result = result.concat(remainedTxt) + "-" + temp + " ";
        }
        return result.trim();
    }

    public static String[] orderStrArr(String[] txtArr) {

// {"dfs", "x", "ab", "ll"};

        String temp = "";
        int j = 1;
        char[] charArr = new char[txtArr.length - 1];

        for (int i = 0; i < txtArr.length; i++) {

            while (j <= txtArr.length - 1 && txtArr[i].length() > txtArr[j].length()) {
                if (txtArr[j].charAt(0) < txtArr[i].charAt(0)) {
                    temp = txtArr[j];
                    txtArr[j] = txtArr[i];
                    txtArr[i] = temp;
                    j++;
                } else {
                    if (txtArr[j].charAt(0) < txtArr[j - 1].charAt(0)) {
                        temp = txtArr[j];
                        txtArr[j] = txtArr[j - 1];
                        txtArr[j - 1] = temp;
                        j++;
                    } else {
                        j++;
                    }
                }
            }
            j = 1;
        }
        return txtArr;
    }

    public static boolean isAnagram2(String s, String t) {

        int[] count = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            // increasing count of that char found in s
            count[s.charAt(i) - 'a']++;
            // decreasing count of that char found in t
            count[t.charAt(i) - 'a']--;
        }
        // every charachter count must be zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;


//        var fs = new int[26]; // create two empty arrays count number of offset for each char in the string array (from letter 'a')
//        var ft = new int[26];
//        for(var c: s.toCharArray()){
//            fs[c-'a']++; //any char inside of s.toCharArray() count++
//        }
//        for(var c: t.toCharArray()){ //same here
//            ft[c-'a']++;
//        }
//        for(int i = 0; i < 26; i++){ //compare the two arrays char by char if any not equal -> false
//            if(fs[i] != ft[i])
//                return false;
//        }
//        return true;

    }

    public static char firstNonRepeatingCharacter(String s) {
//aaabcccdeeef
//        for (int i = 0; i < s.length(); i++) {
//            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){return s.charAt(i);}
//        }

        HashMap<Character, Integer> char_count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_count.containsKey(c)) {
                char_count.put(c, char_count.get(c) + 1);
            } else {
                char_count.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_count.get(c) == 1) return c;
        }

//        int [] count = new int[26];
//        for (char c: s.toCharArray()) {count[c - 'a']++;}
//        for (char c: s.toCharArray()){
//            if(count[c - 'a'] == 1){return c;}
//        }
        return '_';
    }

    public static String reversingString(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            sb.append(str.toCharArray()[i]);
        }

        return sb.toString();
    }

    class Result {
        public static void plusMinus(List<Integer> arr) {
            int zeroCounter = 0;
            int negCounter = 0;
            int posCounter = 0;

            for (Integer integer : arr) {

                if (integer == 0) {
                    zeroCounter++;
                } else if (integer > 0 && integer <= 100) {
                    posCounter++;
                } else {
                    negCounter++;
                }

            }

            System.out.println(String.format("%.6f", (float) posCounter / arr.size()));
            System.out.println(String.format("%.6f", (float) negCounter / arr.size()));
            System.out.println(String.format("%.6f", (float) zeroCounter / arr.size()));
        }

        public static void miniMaxSum(List<Integer> arr) {

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            long totalSum = 0;

            for (int i = 0; i < arr.size(); i++) {

                if (min > arr.get(i)) min = arr.get(i);
                if (max < arr.get(i)) max = arr.get(i);

                totalSum += arr.get(i);
            }

            System.out.format("%d %d", totalSum - max, totalSum - min);

        }
    }
}
