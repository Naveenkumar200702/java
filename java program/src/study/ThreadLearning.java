package study;

import java.util.ArrayList;
import java.util.Scanner;

class ThreadLearning{
public static void generateParenthesis(int length, int open, int close, String current, ArrayList<String> arrays){
    if (open == length && close == length) {
         arrays.add(current);
         return;
    }

    if(open<length){
         generateParenthesis(length, open+1, close, current+"(", arrays);
    }
 
    if(close<open){
         generateParenthesis(length, open, close+1, current+")", arrays);
    }

 }

 public static void main(String ...args){
     System.out.println("Enter the number of pairs");
     Scanner input = new Scanner(System.in);
     int pairs = input.nextInt();
     ArrayList<String> array = new ArrayList<String>(); 
     generateParenthesis(pairs, 0, 0, "", array);
     for (String pair: array) {
         System.out.println(pair);
     }
 }

}

