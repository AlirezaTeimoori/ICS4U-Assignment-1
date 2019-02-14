//-----------------------------------------------------------------
//-- Created by:     Alireza Teimoori      ------------------------
//-- Created on:     Feb 11 2019           ------------------------
//-- Created for:    Assignment 1 - blowup ------------------------
//-- Course Code:    ICS4U                 ------------------------
//-- Teacher Name:   Chris Atkinson        ------------------------
//-----------------------------------------------------------------
//-----------------------------------------------------------------
// This program a creates a function called "blowUp()"   ----------
// This function makes sure that each digit 0-9 that     ----------
// appears in the original string is replaced by that    ----------
// many occurrences of the character to the right of the digit. ---
//-----------------------------------------------------------------


// Import reqired packages:
import java.util.*;


public class blowup{
    public static String blowUp(String input){
        String output = new String();
        // System.out.println("func is started!"); // Notifies that the function is successfully running

        for (int counter = 0; counter < input.length(); counter ++){ // Goes through all the characters in input
            //if (counter < 1){System.out.println("for has started!");} // Notifies that this loop has started

            char charNow = input.charAt(counter); // finds what character the index is and puts it into "charNow"
            char charNext;
            int charValue = Character.getNumericValue(charNow);
            // System.out.println(charNow);
            if (Character.isDigit(charNow)){ // Checks if the character is a number
                //System.out.println(" --- is digit:" + charNow); // Notifies that the char is a digit
                try {
                    charNext = input.charAt(counter+1); // for more convenience :D

                    if (!Character.isDigit(charNext) && charNext != ' '){ // If the next character is not a digit and not space
                        // System.out.println(" --- but this is not a digit: " + charNext); // Notifies that the next character is not a digit

                        for (int count = 0; count < charValue; count++){ // for charValue times, adds the next character to the output
                            // if (count < 1) {System.out.println("* " + charValue + " reproduction begins: \n");} // Notifies that the repeating process has started
                            
                            output = output + charNext;
                        }
                    } else if (Character.isDigit(charNow)){ // If the next character is a digit too, it will just add "charNow" to the output

                        output = output + charNow;
                    }
                } catch (Exception StringIndexOutOfBoundsException) {
                    // System.out.println("catch! muhahahaha!!!!"); // Notifies that an exception has been thrown in the way
                    
                    // this means that (counter + 1) is giving an error
                    // which means counter is at the end of the line
                    // SO:

                    output = output + charNow; // this makes sure that the last character is added to the output as well! :)
                }
            } else{ // If the character is not a digit:

                output = output + charNow; // It will be added to the output
            }
            
        }
        return output; // the sweetest part :)))

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for and storing data:
        System.out.println("Hello! what do you want to blow up today?! :) \n");
        String userInput = scanner.nextLine();

        // Running the blowUp() function:
        System.out.println(blowup.blowUp(userInput)); // :D YESSS! Oops I meant to say: "YE9S!" :)

        scanner.close(); // so annoying :|
    }
        
    
}