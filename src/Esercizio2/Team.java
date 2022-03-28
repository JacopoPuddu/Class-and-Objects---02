package Esercizio2;

public class Team {
    String teamName;    // String used to assign a name to the team
    Programmer p1 = new Programmer();   // Creation of the first "Programmer" object
    Programmer p2 = new Programmer();   // Creation of the second "Programmer" object

    // Output of the class' variables

    public void printTeamDetails(){
        System.out.println("-----------------------------------");
        System.out.println(teamName);
        System.out.println("-----------------------------------");
        System.out.println("Name: " + p1.name + "; Language: " + p1.programmingLanguage + "; YoE: " + p1.yearsOfExperience);
        System.out.println("Name: " + p2.name + "; Language: " + p2.programmingLanguage + "; YoE: " + p2.yearsOfExperience);
        System.out.println("-----------------------------------");
    }
}
