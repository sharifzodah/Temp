public class PrintCharactersAndCount {

    public static void main(String[] args) {
        /**/

        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";
        int strLen = 0;


        for (int i = 0; i < str.length(); i++) {
            strLen = str.length();

            char chars = str.charAt(i);
            int counter = 0;

            str = str.replace(String.valueOf(chars),"");
            counter = strLen - str.length();
            System.out.println(chars + ": "+ counter );
            i--;
        }


        String str1 = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";
        System.out.println("===============");;

        // return how many x, y and z appears in that string.

        for (int i = 0; i < str1.length(); i++) {
            strLen = str2.length();

            char charsToCompare = str1.charAt(i);
            int counter = 0;

            String temp = str2.replace(String.valueOf(charsToCompare), "");
            counter = strLen - temp.length();
            System.out.println(charsToCompare + ": " + counter);
        }
    }
}
