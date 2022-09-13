public class CountHi {


    public static void main(String[] args) {

//        evenOddNumbers(10);
//        catDog("cat5465dogcatjhk5445");
//        System.out.println(countCode("xxxxcozexxcope"));
        System.out.println(bobThere("b12b1b"));

    }

    public static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < (str.length() - 1); i++) {
            count += str.substring(i, i + 2).equals("hi") ? 1 : 0;
        }

        return count;
    }

    public static String multiplicationTable(int number) {
        String result = "";

        for (int i = 1, j = number; i <= 10; i++) {
            result += i * j;
        }
        return result;
    }

    public static void evenOddNumbers(int number) {

        for (int i = 2, j = 1; i <= number; i += 2, j += 2) {
            System.out.println(i + "\t" + j);
        }
    }

    public static boolean catDog(String str) {

        str = str.toLowerCase();
        int catCount = str.replaceAll("[^cat]", "").length() / 3;
        int dogCount = str.replaceAll("[^dog]", "").length() / 3;
        return catCount == dogCount ? true : false;
    }

    public static int countCode(String str) {

        int strLen = str.length();
        int coXesCount = 0;
        String coXeAppearance = "";

        for (int i = 0, j = 4; i < strLen; i++) {
            coXeAppearance = str.contains("co") ? str.substring(str.indexOf("co"), str.indexOf("co") + j) : str;
            coXesCount += coXeAppearance.length() == 4 ? 1 : 0;
            str = str.replace(coXeAppearance, "");
            strLen -= coXeAppearance.length();
            if (!str.contains("co")) {
                break;
            }
        }
        return coXesCount;
    }

    public static boolean bobThere(String str) {

        /*
Return true if the given string contains a "bob" string, but where the middle -'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
bobThere("b12b1b")
bobThere("caba")
bobThere("bb")
*/

        int left;
        int right = 0;
        boolean res = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.length() == 1){
                break;
            }
            else if (str.charAt(i) == 'b') {
                left = str.indexOf(str.charAt(i));
                right = left+2 < str.length() ? left+2 : left+1;
                if (str.charAt(right) == 'b' && right == left+2){
                    return true;
                }
            }
            i--;
            str = str.substring(right+1);
        }


//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'b') {
//                left = i;
//                if (left + 2 <= str.length()) {
//                    right = left + 2;
//                    res = str.charAt(right) == 'b';
//                    break;
//                }
//            }
//        }
        return res;
    }

}
