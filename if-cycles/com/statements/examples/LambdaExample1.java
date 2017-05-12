package com.statements.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Cat {
	private String name;
	private String caste;
	private String nativeLand;
	private int age;

	public Cat() {
	}

	public Cat(String _name, String _caste, String _nativeLand, int _age) {
		this.name = _name;
		this.caste = _caste;
		this.nativeLand = _nativeLand;
		this.age = _age;
	}

	public int getAge() {
		return age;
	}

	public List<Cat> AddCat() {
		// create ArrayList<Cat>, add instances
		List<Cat> catArray = new ArrayList<Cat>();
		Cat cat1 = new Cat("Milla", "Sphinx", "Brazil", 5);
		Cat cat2 = new Cat("Myara", "Siamese", "Argentina", 6);
		Cat cat3 = new Cat("Siera", "Vyslovuhyy", "Arizona", 2);

		catArray.add(cat1);
		catArray.add(cat2);
		catArray.add(cat3);
		return catArray;
	}

	// print Cats instance fields in catArray
	public void printCats(List<Cat> cat) {
		for (Cat c : cat)
			System.out.println("\n Name cat: " + c.name + "\n Caste cat: " + c.caste + "\n Native land: " + c.nativeLand
					+ "\n Age: " + c.age);
	}

	/**
	 * method to print cats that is older than definite amount of years
	 * 
	 * @param age
	 *            year for find any cat that is older
	 * @param cat
	 *            list of all cats
	 **/
	public void printCatOlderThan(List<Cat> cat, int age) {
		String s = "Print cat older than " + age + ":";
		System.out.println(s);
		Stream<Cat> filtered_data = cat.stream().filter(c -> c.age > age);
		filtered_data.forEach(cats -> System.out.println(cats.name + ": " + cats.age));
	}
}

public class LambdaExample1 {

	public static void main(String[] args) throws IOException {
		try {
			String descriptionprogram = "Output information about cats!";
			String messageinsertAgeForCat = "\n ****Please, input age for cat!";
			System.out.println(descriptionprogram);

			Cat cats = new Cat();
			cats.printCats(cats.AddCat());

			System.out.println(messageinsertAgeForCat);
			BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(System.in));
			int ageCat = Integer.parseInt(inputStreamReader.readLine());
			cats.printCatOlderThan(cats.AddCat(), ageCat);

		} catch (NumberFormatException e) {
			System.err.println("Invalid Format!");
		}
	}
}
