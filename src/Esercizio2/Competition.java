package Esercizio2;

/*
 * This program is used to create 3 different types of classes, a "Programmer" class that is inside the "Team" class
 * and a "CompetitionRules" class.
 * The "Programmer" class represents a person
 * The "Team" class represents a team formed by 2 "Programmers" and a team name
 * The "CompetitionRules" class sets the "rules" for a possible competition
 *
 * All classes have a method to print out the details of its components.
 * (I.E.: the "Programmer" class has a method to output the details of the person.)
 *
 */

public class Competition {

    public static void main(String[] args) {
        CompetitionRules rules = new CompetitionRules();

        Team teamA = new Team();
        Team teamB = new Team();

        rules.printRules();     // Output of the rules for the competition, this goes before the teams' initialization

        // Team A initialization

        teamA.teamName = "Code's wiz";

        // A's first programmer

        teamA.p1.name = "Antonio";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 20;

        // A's second programmer

        teamA.p2.name = "Claudio";
        teamA.p2.programmingLanguage = "HTML5";
        teamA.p2.yearsOfExperience = 12;

        // Team B initialization

        teamB.teamName = "The sharp ones";

        // B's first programmer

        teamB.p1.name = "Michele";
        teamB.p1.programmingLanguage = "JavaScript";
        teamB.p1.yearsOfExperience = 8;

        // B's second programmer

        teamB.p2.name = "Marco";
        teamB.p2.programmingLanguage = "C#";
        teamB.p2.yearsOfExperience = 16;

        // Output of both teams' information

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
