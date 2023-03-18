package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

public static void twisters (){
    for (int num =1; num<=110; num++){
    if (num%2==0){System.out.print(" Tweetle");}
    if (num%4==0){System.out.print("Beetle");}
    if (num%6==0){System.out.print("Poodle");}
    if ((num%2!=0)&&(num%4!=0)&&(num%6!=0)){System.out.print(" "+num+" ");}
    if (num%11==0){System.out.print("\n");}
    }
    
}

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 public static String phoneKeypad (String str){
    str = str.toUpperCase();
String x = "";
for (int ch=0; ch<=str.length()-1; ch++){
    switch (str.charAt(ch)){
    case 'A':
    case 'B':
    case 'C':
     x+=2;
    break;
    case 'D':
    case 'E':
    case 'F':
     x+= 3;
    break;
    case 'G':
    case 'H':
    case 'I':
    x+= 4;
    break;
    case 'J':
    case'K':
    case'L':
     x+= 5;
    break;
    case 'M':
    case 'N':
    case 'O': 
    x+= 6;
    break;
    case 'P':
    case 'Q':
    case 'R':
    case 'S':
     x+= 7;
    break;
    case 'T':
    case 'U':
    case 'V': 
    x+=8;
    break;
    case 'W':
    case 'X':
    case 'Y':
    case 'Z':
     x+=9;
    break;

    }

}

return x;
 }
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()
       twisters();
       //prompt user to enter a string 
       System.out.println("Enter a sentence");
       Scanner in = new Scanner (System.in);
       String str = in.nextLine();
       //call method phoneKeypad(string)
       System.out.println(phoneKeypad(str));



    }

}
