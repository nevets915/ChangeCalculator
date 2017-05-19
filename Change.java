package q1;

import java.util.Scanner;

/**
 * <p>Change is a base class which takes a user's currency input and attempts
 * to return the equivalent amount using the fewest amount of 
 * smaller bills and coins.  As long as the user inputs a monetary double value,
 * the program will always calculate the least bills/coins to equal that amount.
 * The dollar bills consist of the tens, the fives and the coins consist of
 * two dollar coins 1 dollar coins, quarters, dimes, nickels and pennies.
 * The program will run errors if anything other than a numerical value is 
 * entered.  The program will print text to notify if it ran successfully.</p>
 *
 * @author Steven Ma. Set 1A.
 * @version 1.0
 */
public class Change {

    /** 
     * <p>10 dollar constant.</p>
     */
    public static final int TEN_DOLLAR = 10; 

    /**
     * <p>5 dollar constant.</p>
     */
    public static final int FIVE_DOLLAR = 5;

    /**
     * <p>2 dollar coin constant.</p>
     */
    public static final int TWO_DOLLAR = 2;

    /** 
     * <p>quarter coin constant.</p>
     */
    public static final double QUARTER_CENT = 0.25;

    /**
     * <p> dime coin constant.</p>
     */
    public static final double DIME_CENT = 0.1;

    /** 
     * <p>nickel coin constant.</p>
     */
    public static final double NICKEL_CENT = 0.05;

    /**
     * <p>penny coin constant.</p>
     */
    public static final double PENNY_CENT = 0.01;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input;
        double input1;
        double cents;  // variable containing the 'cents' of a currency amount.
        int ten;
        int five;
        int two;
        int one;
        int quarter;
        int dime;
        int nickel;
        int penny;

        System.out.print("Please enter a currency amount"
                + " you wish to see change for: ");
        input = scan.nextDouble();

        ten = (int) input / TEN_DOLLAR;
        System.out.println(ten + " ten dollar bills");

        five = ((int) input - ((int) ten * TEN_DOLLAR)) / FIVE_DOLLAR;
        System.out.println(five + " five dollar bills");

        two = ((int) input - ((int) ten * TEN_DOLLAR) 
                - ((int) five * FIVE_DOLLAR)) / TWO_DOLLAR;
        System.out.println(two + " two dollar coins");

        one = (int) input - ((int) ten * TEN_DOLLAR) 
                - ((int) five * FIVE_DOLLAR) - ((int) two * TWO_DOLLAR);
        System.out.println(one + " one dollar coins");

        input1 = (int) input;
        cents = input - input1;
        quarter = (int) (cents / QUARTER_CENT);
        System.out.println(quarter + " quarters");

        dime = (int) ((cents - (quarter * QUARTER_CENT)) / DIME_CENT);
        System.out.println(dime + " dimes");

        nickel = (int) ((cents - (quarter * QUARTER_CENT) 
                - (dime * DIME_CENT)) / NICKEL_CENT);
        System.out.println(nickel + " nickels");

        penny = (int) ((cents - (quarter * QUARTER_CENT) 
                - (dime * DIME_CENT) - (nickel * NICKEL_CENT)) / PENNY_CENT);
        System.out.println(penny + " pennies");

        System.out.println("Question one was called and ran sucessfully.");
    }

};
