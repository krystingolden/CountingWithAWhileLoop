package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*https://programmingbydoing.com/
    Counting with a while loop - Assignment #51
     */

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        int n = 0;
        while ( n < 5 )
        {
            System.out.println( (n+1) + ". " + message );
            n++;
        }

        int n2 = 0;
        while ( n2 < 100 )
        {
            System.out.println( (n2+10) + ". " + message );
            n2 += 10;
        }

    }
}
