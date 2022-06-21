package userInterface;

import java.util.*;
import files.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0,t=1;
		ScoreSheet scoreSheet = new ScoreSheet();
		System.out.println("Starting................");
		while(t>0) {
			System.out.println("Main Menu:");
			System.out.println("1. Create a new Score Sheet");
			System.out.println("2. View Score Sheets");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the File Name: ");
				String fileName = sc.next();
				FileAccess.StoreClass(fileName, DataGetter.getScoreSheet());
				break;
			}
			case 2: {
				System.out.println("Enter the File Name: ");
				String fileName = sc.next();
				scoreSheet = FileAccess.LoadClass(fileName);
				PrintData.PrintInterface(scoreSheet);
				break; 
			}
			case 3: {
				System.exit(0);
			}
			default:
				System.out.print("Unexpected value: " + choice);
			}
		}
		sc.close();
	}
}
