package Esercizio2;

public class CompetitionRules {

    /*
     * A set of strings that sets the rules for the competition, created and initialized inside the class.
     * These are created "private" to disallow the option to change them by someone who's not authorized.
     */

    private String competitionRule1 = "Do not copy from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    // Method to output the rules

    public void printRules(){
        System.out.println("These are the rules of the competition:");
        System.out.println("-----------------------------------");
        System.out.println("First rule: " + competitionRule1);
        System.out.println("Second rule: " + competitionRule2);
        System.out.println("Third rule: " + competitionRule3);
        System.out.println("-----------------------------------");
    }

}
