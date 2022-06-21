package userInterface;

import java.util.Scanner;
import files.*;

public class PrintData {
    public static void PrintInterface(ScoreSheet scoreSheet) {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int choice;
        System.out.println("Match Name: " + scoreSheet.getMatchName());
        System.out.println("Date: " + scoreSheet.getDate());
        System.out.println("Toss Winner: " + scoreSheet.getTossWinner());
        System.out.println("Team One: " + scoreSheet.getTeamOne().getName());
        System.out.println("Team Two: " + scoreSheet.getTeamTwo().getName());
        System.out.println("Overs: " + scoreSheet.getOvers());
        while(isContinue){
            System.out.println("Main Menu:");
            System.out.println("1. View TeamOne Details");
            System.out.println("2. View TeamTwo Details");
            System.out.println("3. Back");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    printTeam(scoreSheet.getTeamOne());
                    break;
                }
                case 2: {
                    printTeam(scoreSheet.getTeamTwo());
                    break;
                }
                case 3: {
                    isContinue = false;
                    break;
                }
                default:
                    System.out.print("Unexpected value: " + choice);
                    break;
            }
        }
    }

    public static void printTeam(Team team){
        System.out.println("Team Name: " + team.getName());
        System.out.println("Runs: " + team.getRuns());
        System.out.println("Wickets: " + team.getWickets());
        for(Batsman batsman : team.getBatsman()) {
            System.out.println("Batsman Name: " + batsman.getName());
            System.out.println("Batsman Runs: " + batsman.getRuns());
            System.out.println("Batsman Balls: " + batsman.getBalls());
            System.out.println("Batsman Fours: " + batsman.getFours());
            System.out.println("Batsman Sixes: " + batsman.getSixes());
        }
        for(Bowler bowler : team.getBowler()) {
            System.out.println("Bowler Name: " + bowler.getName());
            System.out.println("Bowler Runs: " + bowler.getRuns());
            System.out.println("Bowler Wickets: " + bowler.getWickets());
            System.out.println("Bowler Overs: " + bowler.getOvers());
        }
    }
}
