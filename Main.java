import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Q-1 : Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
        • Input: Weight (kg) = 70, Height (m) = 1.75
        • Expected Output: BMI = 22.86*/

        System.out.println("Enter your weight with Kg");
        Scanner input_weight = new Scanner(System.in);
        double weight = input_weight.nextDouble();
        System.out.println("Enter your height with m");
        Scanner input_height = new Scanner(System.in);
        double height = input_height.nextDouble();
        double BMI = weight/(height*height);
        System.out.println(BMI);

        /* Q-2 : Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
        • Input: Obtained Marks = 85, Total Marks = 100
        • Expected Output: Percentage = 85.0%*/

        System.out.println("Enter the obtained marks");
        Scanner input_obtained_marks = new Scanner(System.in);
        double marks = input_obtained_marks.nextDouble();
        System.out.println("Enter total marks");
        Scanner input_total_marks = new Scanner(System.in);
        double total_marks = input_total_marks.nextDouble();
        double percentage = (marks*100)/total_marks;
        System.out.println(percentage+"%");

        /* Q-3 :Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.
        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        • Expected Output: Amount in EUR = 85.0*/

        System.out.println("Enter amount with USD currency");
        Scanner input_currency = new Scanner(System.in);
        double currency = input_currency.nextDouble();
        System.out.println("Enter Exchange Rate");
        Scanner input_exchange_rate= new Scanner(System.in);
        double exchange_rate= input_exchange_rate.nextDouble();
        System.out.println(currency*exchange_rate);

        /* Q -4 : Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.
        • Input: "Hello, World!"
        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW
        ,olleH"*/

        System.out.println("Enter string ");
        Scanner input_string = new Scanner(System.in);
        StringBuilder string_builder = new StringBuilder(input_string.nextLine());
        System.out.print("Length of the string: "+string_builder.length());
        System.out.println(" And Reversed string: "+string_builder.reverse());

        /* Q -5 : Develop a program that takes a sentence as input and extracts a substring from
        it, then prints the extracted substring.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
          = 10, End Index = 20
        • Expected Output: "brown fox"
        */

        System.out.println("Enter sentence ");
        Scanner input_sentence = new Scanner(System.in);
        String sentence = input_sentence.nextLine();
        System.out.println(sentence.substring(10,20));

        /* Q -6 :Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
        "jumps"
        • Expected Output: Keyword "jumps" is present in the sentence.*/

        System.out.println("Enter new sentence ");
        Scanner input_sentence2 = new Scanner(System.in);
        String sentence2 = input_sentence2.nextLine();
        System.out.println("Enter another sentence ");
        Scanner input_keyword = new Scanner(System.in);
        String keyword = input_keyword.nextLine();
        System.out.println(sentence2.contains(keyword));

        /* Q -7 : Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified
        sentence.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
        Replace = "fox", Replacement Word = "cat"
        • Expected Output: "The quick brown cat jumps over the lazy dog"*/

        System.out.println("Enter new sentence ");
        Scanner input_sentence3 = new Scanner(System.in);
        String sentence3 = input_sentence3.nextLine();
        System.out.println("Enter your old word ");
        Scanner input_oldWord= new Scanner(System.in);
        String old_word= input_oldWord.nextLine();
        System.out.println("Enter your modify word ");
        Scanner input_modify= new Scanner(System.in);
        String modify_word = input_modify.nextLine();
        System.out.println(sentence3.replace(old_word,modify_word));

       /*  Q -8 : Write a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.
        • Input: String 1 = "Hello", String 2 = "hello"
        • Expected Output: Strings are equal (ignoring case).*/

        System.out.println("Enter first string ");
        Scanner input_string1 = new Scanner(System.in);
        String string1 = input_string1.nextLine();
        System.out.println("Enter second string");
        Scanner input_string2= new Scanner(System.in);
        String string2= input_string2.nextLine();
        System.out.println(string1.equalsIgnoreCase(string2));











    }

}