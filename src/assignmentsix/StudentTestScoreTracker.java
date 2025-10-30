package assignmentsix;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTestScoreTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Test Score:");
		int n = sc.nextInt();
		
		int[] scores = new int[n];
		
		System.out.println("Enter the " + n + " Scores:");
		for(int i = 0; i<n; i++) {
			scores[i] = sc.nextInt();
		}
		
		ArrayList <Integer> scoresList = new ArrayList<>();
		for(int score : scores) {
			scoresList.add(score);
		}
		
		System.out.println("Elements in the Arraylist :");
		for(int e : scoresList) {
			System.out.println(e);
		}
		
		sc.close();

	}

}