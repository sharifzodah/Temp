import java.util.Scanner;

public class FirstMentoringTasks {

    public static void main(String[] args) {
        String str = "Java is fun";
        int a = str.indexOf('a');
        System.out.println(str.substring(0, str.lastIndexOf('a')+1));
        int is = str.indexOf("is ");
        System.out.println(str.substring(is, str.lastIndexOf(' ') ));
        System.out.println(str.substring(str.indexOf("fun")));


        String usa = "united states of america";
        int a1 = usa.lastIndexOf('a');
        System.out.println("a1 = " + a1);
        int a2 = usa.lastIndexOf('a', --a1);
        System.out.println("a2 = " + a2);
        System.out.println(usa.charAt(a2));

        String text = "Java Exercises for Mentoring Session";

        System.out.println(text.substring(0, text.indexOf(' ')));


        String price = "$5.25";
        String qty = "5";

        double dPrice = Double.parseDouble(price.replaceAll("[^0-9.]", ""));
        int iQty = Integer.parseInt(qty);
        System.out.println(dPrice*iQty);

        String bitcoinPrice = "($22,938.81 United States Dollar)";
        String qty1 = "0.657 BTC";
        double dBitcoinPrice = Double.parseDouble(bitcoinPrice.replaceAll("[^\\d.]", ""));
        System.out.println(dBitcoinPrice);
        double dQty = Double.parseDouble(qty1.replaceAll("[^\\d.]", ""));
        System.out.println(dQty*dBitcoinPrice);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        System.out.println("your name is: " + scan.nextLine());
        System.out.println("enter your address");
        System.out.println("your address is: " + scan.nextLine());

        //        int myAge = 21;
//        System.out.println("myAge = " + --myAge); // myAge = 20; 21-1;
//        myAge +=1; // myAge = myAge+1; ++myAge;
//        System.out.println("myAge = " + ++myAge); // myAge = 22; 21+1;

//        System.out.println("myAge = " + myAge++); //Output is 21; it increases the value by 1 on the next call
//        System.out.println("myAge = " + myAge); // 22
//        System.out.println("myAge = " + myAge--); // 22
//        System.out.println("myAge = " + myAge); // 21
//
//
//
//       // byte < short <  int < long <  float <  double
//
//        int i1 = 20;
//        byte b1;
//        float fl1 = 20.05f; // 20.0
//
//        b1 = (byte) i1;
//
//        i1 = (int) fl1;
//
//
//
//        int i2; //declaring is creating a variable without assigning any value
//        double db2 = 20.0;  // initialization
//
//        System.out.println("i2 = " + (i2 = 5));
//        System.out.println("db2 = " + db2);


//Task4();

    }

    //      TASK1: Write a program, which prints out the text, its length and char representation of the length
//      TEXT:  ASCII stands for American Standard Code for Information Interchange.
//      NOTE: Text should be in double quotes. Character should be in single quotes.
    public static void Task1() {

        String str = "ASCII stands for American Standard Code for Information Interchange.";
        int strLength = str.length();
        char lengthToChar = (char) strLength;

        System.out.println("str = " + "\"" + str + "\"");
        System.out.println("strLength = " + strLength);
        System.out.println("lengthToChar = " + "\'" + lengthToChar + "\'");
    }

    //      TASK2: Write a program, which adds to the text, its length and char representation of the length
//      TEXT:  Computers can only understand numbers, so an ASCII code is the numerical representation of a characters.
//      NOTE: Print out each value in separate line. Character should be in single quotes.
    public static void Task2() {

        String str = "Computers can only understand numbers, so an ASCII code is the numerical representation of a characters.";
        int strLength = str.length();
        char lengthToChar = (char) strLength;

        System.out.println("Text: " + str.concat("\nLength: " + strLength).concat("\nChar rep: " + "\'" + lengthToChar + "\'"));

//        System.out.printf("Text: \"%s\"%n" + "Length: %d%n" + "Char rep: '%c'%n", str,strLength,lengthToChar);
    }

    //      TASK3: Write a program, which prints out following texts in one line by using a String method
//      Text1: Java
//      Text2: programming
//      Text3: language
//      Text4: is fun
//      NOTE: Do not use any variables. Code should be in a single line.
    public static void Task3() {

        System.out.println("Java ".concat("programming ").concat("language ").concat("is fun"));
    }

// TASK4: Create following variables:
//        byte b = 5;
//        short s = 8;
//        int i = 10;
//        long l = 11;
//        float f = 12.13f;
//        double d = 15.0;

    //   create new variable as follows:
//   int i1 = 0;
//   reassign all variables to it.
//   identify type of casting for each reassignment
//   Sample output: upcasting ===> 8
    public static void Task4(){

        byte b = 5;
        short s = 8;
        int i = 10;
        long l = 11;
        float f = 12.13F;
        double d = 15.0;

        int i1 = 0;
        i1 = b;
        System.out.println("upcasting ===>" + i1);

        i1 = s;
        System.out.println("upcasting ===>" + i1);

        i1 = i;
        System.out.println("value reassignment ===>" + i1);

        i1 = (int)l;
        System.out.println("down casting ===>" + i1);

        i1 = (byte)f;
        System.out.println("down casting ===>" + i1);

        i1 = (short)d;
        System.out.println("down casting ===>" + i1);
    }

    // Increment and Decrement Tasks
    public static void incrementAndDecrementOperators(){

// 1) What will be the output of the following program?
        int i = 11;
        i = i++ + ++i;

// 2) Guess the output of the following program?
        int a=11, b=22, c;
        c = a + b + a++ + b++ + ++a + ++b;

// 3) What will be the output of the below program?
        int i1=0;
        i1 = i1++ - --i1 + ++i1 - i1--;

// 4) What will be the output of the following program?
        int a1=1, b1=2;
        int c1 = --b1 - ++a1 + ++b1 - --a1;

// 5) What will be the output of the following program?
        int m=20, n=10;
        int o = m++ / ++n * m-- / --n;

// 6) What will be the output of the following program?
        int ch = 'a';
        System.out.println(ch++);
        System.out.println(++ch);
        System.out.println((char) ++ch);
    }
}
