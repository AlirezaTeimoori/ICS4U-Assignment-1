//-------------------------------------------
//-- Created by:     Alireza Teimoori      --
//-- Created on:     Feb 11 2019           --
//-- Created for:    Assignment 1 - blowup --
//-- Course Code:    ICS4U                 --
//-- Teacher Name:   Chris Atkinson        --
//-------------------------------------------

//import java.util.*;

public class blowup{
    public static String blowUp(String input){
        String output = new String();
        System.out.println("func is started!");

        for (int counter = 0; counter < input.length(); counter ++){ // Goes through all the characters in input
            if (counter < 1){System.out.println("for has started!");} // Notifies that this loop has started

            char charNow = input.charAt(counter); // finds what character the index is and puts it into "charNow"
            char charNext;
            int charValue = Character.getNumericValue(charNow);
            System.out.println(charNow);
            if (Character.isDigit(charNow)){ // Checks if the character is a number
                System.out.println(" --- is digit:" + charNow);
                try {
                    charNext = input.charAt(counter+1);
                    if (Character.isAlphabetic(charNext)){
                        System.out.println(" --- but this is not a digit: " + charNext);
                        for (int count = 0; count < charValue; count++){
                            if (count < 1) {System.out.println("* " + charValue + " reproduction begins: \n");}
                            
                            output = output + charNext;
                            
                        }
                    } else if (Character.isDigit(charNow)){
                        output = output + charNow;
                    }
                } catch (Exception e) {
                    System.out.println("catch! muhahahaha!!!!");
                    output = output + charNow;
                }
            } else if (Character.isAlphabetic(charNow)){
                output = output + charNow;
            }
            
        }
        return output;

    }
    public static void main(String[] args) {
        System.out.println(blowup.blowUp("a3fb4d59"));
    }
        
    
}