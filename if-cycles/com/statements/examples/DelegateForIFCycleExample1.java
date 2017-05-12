package com.statements.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//implementation delegate pattern
public class DelegateForIFCycleExample1 {

	public static void main(String[] args) throws IOException {
		Searching search = new Searching();
		search.getScaleECTS(new messageRestartProgram());
		search.print();
	}
}

interface ECTS {
	void print();
}

class messageDescriptionProgram implements ECTS {
	public void print() {
		System.out.println("Search the score on a scale ECTS!");
	}
}

class messageForInputDataProgram implements ECTS {
	public void print() {
		System.out.println("Input marks: ");
	}
}

class messageRestartProgram implements ECTS {
	public void print() {
		System.out.println("Do you really want to restart? Y/N");
	}
}

class messageErrorProgram implements ECTS {
	public void print() {
		System.err.println("Invalid Format!");
	}
}

class messageInfoProgram implements ECTS {
	public void print() {
		System.out.println("Output the mark outside!");
	}
}

class Searching {
	ECTS ects;

	public void print() {
		ects.print();
	}

	void getScaleECTS(ECTS _ects) throws IOException {

		messageDescriptionProgram messageDescription = new messageDescriptionProgram();
		messageDescription.print();
		messageForInputDataProgram messageForInput = new messageForInputDataProgram();
		messageForInput.print();
		BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(System.in));
		String markValue = null;
		String ecst = null;
		markValue = inputStreamReader.readLine().toString();
		try {
			int i = Integer.parseInt(markValue);
			if (i >= 1 && i <= 34) {
				ecst = "F";
			} else if (i >= 35 && i <= 59) {
				ecst = "FX";
			} else if (i >= 60 && i <= 66) {
				ecst = "E";
			} else if (i >= 67 && i <= 74) {
				ecst = "D";
			} else if (i >= 75 && i <= 81) {
				ecst = "C";
			} else if (i >= 82 && i <= 89) {
				ecst = "B";
			} else if (i >= 90 && i <= 100) {
				ecst = "A";
			} else if (i >= 101) {
				messageInfoProgram message = new messageInfoProgram();
				message.print();
			}
			System.out.println(ecst);
		} catch (NumberFormatException e) {
			messageErrorProgram message = new messageErrorProgram();
			message.print();
		}
		ects = _ects;
	}
}
