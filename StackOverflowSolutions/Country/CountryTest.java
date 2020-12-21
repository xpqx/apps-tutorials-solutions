package javaQuestionsAndAnswers;

import java.util.ArrayList;
import java.util.List;

public class CountryTest {
	public static void main(String[] args) {
		Country country = new Country ("Pakistan", new ArrayList<>(List.of(21, 62, 46, 98, 67, 34, 25, 9)), new ArrayList<>(List.of(1,2,3,4,5,6,7,8)));
		   System.out.println(country.computeArea());
	}

}
