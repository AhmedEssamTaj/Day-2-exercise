/*

Author: Ahmed Essam Taj
Date: 21, Oct, 2024
Day 2 Exercise

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


       /*
       Q1/ Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it
        */


        // ===== answer Q1 ==============


        System.out.println("============================================");
        System.out.println("Q1/ ");

        System.out.print("Please enter your wieght in (km): ");
        double wieght = in.nextDouble();

        System.out.print("Please enter your height in (m): ");
        double height = in.nextDouble();


        double BMI = ( (wieght / (height * height)) *100);

         BMI = Math.round(BMI) ;

        System.out.println("your BMI is: "+BMI/100);



/* Q2 / Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
*/

        // ===== answer Q2 ==============


        System.out.println("============================================");
        System.out.println("Q2/ ");

        System.out.print("Please enter the obtained marks: ");
        int marks = in.nextInt();
        System.out.print("Please enter the total marks: ");
        int totalMarks = in.nextInt();

        double percentage = (marks * 100) / totalMarks;
        System.out.println("your percentage is: " + percentage+ "%");



      /* Q3 / Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
*/

        // ===== answer Q3 ==============


        System.out.println("============================================");
        System.out.println("Q3/ ");

        System.out.print("Please enter the amount in USD ($): ");
        double amount = in.nextDouble();

        System.out.print("Please enter the Exchange Rate:  ");
        double exchangeRate = in.nextDouble();

        double exchangedAmount = amount * exchangeRate;
        System.out.println("your exchanged amount is: " + exchangedAmount);


      /* Q4 / Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.
*/

        // ===== answer Q4 ==============

        in.nextLine();

        System.out.println("============================================");

        System.out.println("Q4/ ");

        System.out.println("Please enter a string: ");

        String text = in.nextLine();

        int textLength = text.length();
        System.out.println("your string length is: " + textLength);

        StringBuilder reversedText = new StringBuilder(text);
        reversedText = reversedText.reverse();
        System.out.println("Reversed String is: "+ reversedText);

      /* Q5 / Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.
*/

        // ===== answer Q5 ==============

        System.out.println("Please enter a sentence: ");
        String sentence = in.nextLine();
        System.out.println("Please enter the start index: ");
        int startIndex = in.nextInt();
        System.out.println("Please enter the end index: ");
        int endIndex = in.nextInt();

        sentence = sentence.substring(startIndex, endIndex);
        System.out.println("Your subsentence is: " + sentence);

      /* Q6 / Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.
*/

        // ===== answer Q6 ==============

        in.nextLine();
        System.out.println("Please enter a sentence: ");
        sentence = in.nextLine();
        System.out.println("Please enter the keyword: ");
        String keyword = in.nextLine();

        System.out.println("The keyword " + keyword +
                " is present in the sentence: " + sentence.contains(keyword));


        /* Q7 / Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
*/

        // ===== answer Q7 ==============

        System.out.println("Please enter a sentence: ");
        sentence = in.nextLine();
        System.out.println("Please enter the word you want to be replaced: ");
        String replacedWord = in.nextLine();

        //String replacementWord = "Cat";

        System.out.println(sentence.replace(replacedWord, "Cat"));


        /* Q8 / Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
*/

        // ===== answer Q8 ==============

        System.out.println("Please enter string1: ");
        String string1 = in.nextLine();
        System.out.println("Please enter string2: ");
        String string2 = in.nextLine();

        System.out.println("string 1 equals string 2: " + string1.equalsIgnoreCase(string2));


    }
}