package com.statements.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfCyclesExample1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Search score on a scale ECTS!"); // Display the
																// description.
		ScaleECTS();

		System.out.print("Restart? Y/N");
		BufferedReader yesnot = new BufferedReader(new InputStreamReader(System.in));
		String beornottobe = (yesnot.readLine().toString());

		if (beornottobe.equals("Y")) {
			ScaleECTS();
		} else {
			System.exit(0);
		}
	}

	public static void ScaleECTS() throws IOException {
		BufferedReader mark = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter mark:");
		try {
			int i = Integer.parseInt(mark.readLine());
			if (i >= 1 && i <= 34) {
				System.out.println("F");
			} else if (i >= 35 && i <= 59) {
				System.out.println("FX");
			} else if (i >= 60 && i <= 66) {
				System.out.println("E");
			} else if (i >= 67 && i <= 74) {
				System.out.println("D");
			} else if (i >= 75 && i <= 81) {
				System.out.println("C");
			} else if  (i >= 82 && i <= 89) {
				System.out.println("B");
			} else if (i >= 90 && i <= 100) {
				System.out.println("A");
			} else if (i >= 101) {
				System.out.println("Output the mark outside!");
			}

		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}
	}
}
