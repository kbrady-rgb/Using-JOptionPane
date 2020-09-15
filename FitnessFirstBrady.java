//Kabrina Brady

import javax.swing.*;
import java.text.MessageFormat;
import java.util.Scanner;

public class FitnessFirstBrady {
    public static void main(String[] args) {
        //Declare variables
        String memberID;
        String min;
        String invalid = "Invalid member ID.";
        String formattedID;
        String partOne;
        String partTwo;
        String partThree;
        int minutes;
        int hours;
        String minAndHr;

        //Initialize scanner
        Scanner input = new Scanner(System.in);

        memberID = JOptionPane.showInputDialog("Enter your 6-character member ID: ");

        //Executes if memberID is the correct length
        if (memberID.length() == 6){
            min = JOptionPane.showInputDialog("Enter the number of minutes: ");

            //Gets the remainder of minutes/60
            minutes = Integer.parseInt(min)%60;
            //Gets the number of hours (number of times the total number of minutes is able to be evenly divided by 60)
            hours = Integer.parseInt(min)/60;
            //Assigns to string
            minAndHr = hours + " hours and " + minutes + " minutes.";

            //Creates a format pattern for memberID, with three arguments (which will be parts 1, 2, and 3)
            MessageFormat idFormat = new MessageFormat("{0}-{1}-{2}");
            //Extracts the first character from memberID
            partOne = memberID.substring(0,1);
            //Extracts the second through fourth character from memberID
            partTwo = memberID.substring(1,4);
            //Extracts the fifth and sixth characters
            partThree = memberID.substring(4);
            //Creates object containing all three parts of memberID
            Object[] testArgs = {new String(partOne), new String(partTwo), new String(partThree)};
            //Formats and assigns to new variable
            formattedID = idFormat.format(testArgs);
            //Success message
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Thank you, Member " + formattedID.toUpperCase() + " for your massage reservation for " + min + " minutes, or " + minAndHr);
        }
        else{
            //Displays if user enters incorrect number of characters for the Member ID
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), invalid);
        }
    }
}
