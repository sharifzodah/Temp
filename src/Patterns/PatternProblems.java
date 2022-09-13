package Patterns;

import javax.swing.*;
import java.util.Scanner;

public class PatternProblems {


    public static void main(String[] args) {
//
////        pattern1(5);
        pattern5(5);


    }

    public static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(" *");
            }

            System.out.println("");
        }
    }

    public static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {

            for (int spaces = row; spaces <= n; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){

        for (int row = n; row >= 1; row--) {

            for (int col = row; col >= 1; col--) {

                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n) {

        for (int row = n; row >= 1; row--) {

            for (int spaces = n; spaces >= row; spaces--) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {

        for (int row = 1; row <= n; row++) {
            int spaceCount = 2*(n-row);//n-row > 0 ? n-row : 1;
            for (int space = 1; space <= spaceCount; space++) {
                System.out.print(" ");
            }
            int colCount = 2*n-spaceCount-1 == 0 ? 1 : 2*n-spaceCount-1;
            for (int col = 1; col <= colCount; col++) {
                System.out.print("* ");
            }
            System.out.println("");
            System.out.println("");
        }
    }

    public static void pattern8(int n){

        for (int row = 1; row < 2*n ; row++) {

            int totalColumnsInRow = row > n ? 2*n - row : row;

            for (int col = 1; col <= totalColumnsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){

        for (int row = 2*n; row >= 1; row--) {

            int totalColumnsInRow = row >= n ? row - n: n-row+1;

            if (totalColumnsInRow == 0){
                continue;
            }
            for (int col = totalColumnsInRow; col >= 1; col--) {

                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
