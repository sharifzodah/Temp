import java.util.Arrays;

public class test2 {

    public static void main(String[] args) {
//
//        int number1 = 25;
//        int number2 = 39;
//
//        if ( number1 == number2 )
//            System.out.printf( "%d == %d\n", number1, number2 );
//        if ( number1 != number2 )
//            System.out.printf( "%d != %d\n", number1, number2 );
//        if ( number1 < number2 )
//            System.out.printf( "%d < %d\n", number1, number2 );
//        if ( number1 > number2 )
//            System.out.printf( "%d > %d\n", number1, number2 );
//        if ( number1 <= number2 )
//            System.out.printf( "%d <= %d\n", number1, number2 );
//        if ( number1 >= number2 )
//            System.out.printf( "%d >= %d\n", number1, number2 );
//
//        System.out.printf("%d == %d == %d", number1,number2,number1++);

        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
        System.out.println(wordEnds("abcXYXYijk", "XY"));
        System.out.println(wordEnds("XYXY", "XY"));

    }

    /*
    * Given a string and a non-empty word string,
    * return a string made of each char just before
    * and just after every appearance of the word in the string.
    * Ignore cases where there is no char before or after the word,
    * and a char may be included twice if it is between two words.
wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
wordEnds("XYXY", "XY") → ignore
    * */

    public static String wordEnds(String str, String word) {

        String result = "";
        if (str.contains(word)) {
            int firstAppearanceZeroIndex = str.indexOf(word);
            int firstAppearanceLastIndex = str.indexOf(word.charAt(word.length() - 1));
            int firstAppearanceLastIndexNextChar = str.indexOf(word.charAt(word.length() - 1)) + 1;
            int secondAppearanceZeroIndex = str.lastIndexOf(word);
            int secondAppearanceLastIndexNextChar = str.lastIndexOf(word.charAt(word.length() - 1)) + 1;
            int secondAppearanceLastIndex = str.lastIndexOf(word.charAt(word.length() - 1));

            boolean onlyWord = str.replaceAll(word, "").length() == 0;

            while (!onlyWord) {
                if (secondAppearanceZeroIndex != firstAppearanceLastIndexNextChar) {

                    if (firstAppearanceZeroIndex > 0 && secondAppearanceLastIndex < str.length() - 1) {

                        result = str.substring(firstAppearanceZeroIndex - 1, firstAppearanceZeroIndex)
                                .concat(str.substring(firstAppearanceLastIndexNextChar, firstAppearanceLastIndexNextChar + 1))
                                .concat(str.substring(secondAppearanceZeroIndex - 1, secondAppearanceZeroIndex))
                                .concat(str.substring(secondAppearanceLastIndexNextChar, secondAppearanceLastIndexNextChar + 1));

                    } else if (firstAppearanceZeroIndex == 0 && secondAppearanceLastIndex == str.length() - 1) {

                        result = str.substring(firstAppearanceLastIndexNextChar, firstAppearanceLastIndexNextChar + 1)
                                .concat(str.substring(secondAppearanceZeroIndex - 1, secondAppearanceZeroIndex));
                    }

                } else {
                    result = str.substring(firstAppearanceZeroIndex - 1, firstAppearanceZeroIndex).concat(str.substring(secondAppearanceLastIndexNextChar, secondAppearanceLastIndexNextChar + 1));
                }

                onlyWord = true;
            }

        }


        return result;

    }
}
