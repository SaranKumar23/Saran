package userInterface;

import java.util.*;
import files.*;

public class DataGetter {
    static Scanner sc = new Scanner(System.in);
    public static ScoreSheet getScoreSheet() {
        ScoreSheet scoreSheet = null;
        System.out.println("Enter the Match Name: ");
        String matchName = sc.nextLine();
        System.out.println("Enter the Date and Time: ");
        String date = sc.nextLine();
        System.out.println("Enter the number of overs: ");
        int overs = sc.nextInt();
        System.out.println("Enter the Toss Winner(1 for team 1, 2 for team 2): ");
        int tossWinner = sc.nextInt();
        System.out.println("Enter the Team 1 Details: ");
        Team teamOne = getTeam();
        System.out.println("Enter the Team 2 Details: ");
        Team teamTwo = getTeam();
        scoreSheet = new ScoreSheet(matchName, date, tossWinner, teamOne, teamTwo, overs);
        return scoreSheet;
    }

    public static Team getTeam(){
        Team team = null;
        System.out.println("Enter the Team Name: ");
        String teamName = sc.next();
        System.out.println("Enter the Runs: ");
        int runs = sc.nextInt();
        System.out.println("Enter the Wickets: ");
        int wickets = sc.nextInt();
        System.out.println("Enter the No. of Batsman: ");
        int batCount = sc.nextInt();
        System.out.println("Enter the No. of Bowlers: ");
        int bowlCount = sc.nextInt();
        List<Batsman> batsmanList = new ArrayList<>();
        List<Bowler> bowlerList = new ArrayList<>();
        for(int i = 1; i <= batCount; i++){
            System.out.println("Enter the Details of Batsman " + i + ": ");
            batsmanList.add(getBatsman());
        }
        for (int i = 1; i <= bowlCount; i++) {
            System.out.println("Enter the Details of Bowler " + i + ": ");
            bowlerList.add(getBowler());
        }
        team = new Team(teamName, runs, wickets, batsmanList, bowlerList);
        return team;
    }

    public static Batsman getBatsman() {
        Batsman batsman = null;
        System.out.println("Enter the Batsman Name: ");
        String name = sc.next();
        System.out.println("Enter the Runs Scored: ");
        int runs = sc.nextInt();
        System.out.println("Enter the Balls Faced: ");
        int balls = sc.nextInt();
        System.out.println("Enter No.of Fours: ");
        int fours = sc.nextInt();
        System.out.println("Enter No.of Sixes: ");
        int sixes = sc.nextInt();
        batsman = new Batsman(name, runs, balls, fours, sixes);
        return batsman;
    }

    public static Bowler getBowler() {
        Bowler bowler = null;
        System.out.println("Enter the Bowler Name: ");
        String name = sc.next();
        System.out.println("Enter the Overs Bowled: ");
        int overs = sc.nextInt();
        System.out.println("Enter the Runs Conceeded: ");
        int runs = sc.nextInt();
        System.out.println("Enter the Wickets Taken: ");
        int wickets = sc.nextInt();
        System.out.println("Enter the no.of Wide Balls: ");
        int wide = sc.nextInt();
        bowler = new Bowler(name, overs, runs, wickets,wide);
        return bowler;
    }
}
