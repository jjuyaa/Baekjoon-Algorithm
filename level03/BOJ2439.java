package level03;

import java.util.Scanner;

public class BOJ2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = N-i; j > 0; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}