package Esercizio2;

public class Programmer {
    String name;    // Variable that indicates the name of the programmer
    String programmingLanguage;     // Variable that indicates the programming language of the programmer
    int yearsOfExperience;      // Variable that indicates the number of years of exp. of the programmer

    /*
     * Method to print out the characteristics of the "Programmer" class
     */

    public void printProgrammerDetails(){
        System.out.println(name + " is specialised in " + programmingLanguage + " and has " + yearsOfExperience + "years of experience");
    }
}
