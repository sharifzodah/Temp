public class WordEnds {

    public static void main(String[] args) {
            /*
    * Given a string and a non-empty word string,
    * return a string made of each char just before
    * and just after every appearance of the word in the string.
    * Ignore cases where there is no char before or after the word,
    * and a char may be included twice if it is between two words.
wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
wordEnds("XY1XYabcXY", "XY") → "11"
wordEnds("XYXY", "XY") → ignore
    * */
        String text = "abcXY123XYabcXY";
        String text1 = "XY123XYabcXY";
        String text2 = "XY1XYabcXY";
        String text3 = "XYXYabcXY";
        String text4 = "XYXY";
        String text5 = "abc1xyz11";
        wordEnds(text5, "1");

    }
    public static String wordEnds(String str, String word){

        int wordLen = word.length();
        int indexOfFirstAppearance = str.indexOf(word);
        int indexOfNextAppearance = str.indexOf(word, indexOfFirstAppearance+1);;
        int countOFAppearances = (str.length() - str.replace(word,"").length())/wordLen;
        String output = "";

        int counter = 0;
        counter += str.indexOf("h")+1 == 'i' ? 1 : 0;

        System.out.println("output = " + output);

        while (str.contains(word)){

            if ( countOFAppearances > 1) {

                if (indexOfFirstAppearance > 0 && (indexOfFirstAppearance + wordLen) - 1 < str.length()) {
                    output += str.charAt(indexOfFirstAppearance - 1);
                    output += str.charAt(indexOfFirstAppearance + wordLen);
                } else if (indexOfFirstAppearance == 0 && (indexOfFirstAppearance + wordLen) - 1 < str.length()) {
                    output += str.charAt(indexOfFirstAppearance + wordLen);
                }
                countOFAppearances--;
                str = str.substring(indexOfNextAppearance-1); //indexOfFirstAppearance+wordLen
            }
            else if (countOFAppearances >= 1 && indexOfFirstAppearance > 0) {

                if ((indexOfFirstAppearance + wordLen) < str.length()) {
                    output += str.charAt(indexOfFirstAppearance - 1);
                    output += str.charAt(indexOfFirstAppearance + wordLen);
                }else {
                    output += str.charAt(indexOfFirstAppearance - 1);
                }
                str = "";
            }else {
                str = str.substring(indexOfFirstAppearance + wordLen);
                countOFAppearances--;
            }
            indexOfFirstAppearance = !str.isEmpty() && str.charAt(0) != str.charAt(str.indexOf(word)) ? str.indexOf(word) : str.lastIndexOf(word);
            indexOfNextAppearance = indexOfFirstAppearance != str.length()-1 ? str.indexOf(word, indexOfFirstAppearance+1): indexOfFirstAppearance;
        }
        System.out.println("output = " + output);
        return output;
    }
}
