package com.company;

public class Main {
    /*
    Given the String like "20*((876/8)+19)" , implements the method that check
    if the parentheses are correct. Try to solve it yourself without help of Google
        "9*(8+3)-( (9+1)5)" -> true
        "9(8+3)- (9+1)5)" -> false
        "98+3)-( (9+1)*5" -> false
    */

    public static void main(String[] args) {
        System.out.println(checkParentheses("[{9*(8+3)}-( (9+1)5)]"));
        System.out.println(checkParentheses("[[9(8+3)[]]- (9+1)5)"));
        System.out.println(checkParentheses("98{{+3[)-( (]9+1)][*5["));
        System.out.println(checkParentheses("[{9*(8+3)}-( (9+1)5)]"));
        System.out.println(checkParentheses("[{9*(8+3)}-( (9+1)5)]"));


    }

    public static boolean  checkParentheses(String str){

        int counter=0;
        int counter1=0;
        int counter2=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='(' ) {
                counter++;
            }
            if (ch=='{' ) {
                counter1++;
            }
            if (ch=='[') {
                counter2++;
            }
            if (ch==')'){
                counter--;
            }
            if (ch=='}' ) {
                counter1--;
            }
            if (ch==']') {
                counter2--;
            }
            if (counter<0) {
                return false;
            }
        }
        return counter==0;
    }
}