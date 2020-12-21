/*
*
*This problem seems interesting to solve. Posted for later.
* Problem found at this url: https://stackoverflow.com/questions/65399795/my-code-isnt-picking-up-the-arraylist-values-in-test-class
* The complete solution to this code isn't that hard to figure out. Complete solution will be posted later.
*
*/

import java.util.*;
public class Country {
	
	public String name;
	ArrayList<Integer> provincesAreas = new ArrayList<>();
	ArrayList<Integer> statesAreas;

	public Country(String name, ArrayList<Integer> provincesAreas, ArrayList<Integer> statesAreas) {
		this.name = name;
		this.provincesAreas = provincesAreas;
		this.statesAreas = new ArrayList<Integer>(statesAreas);
	}

	public double computeArea()	{
		double parea=0;
		for (Integer pA: provincesAreas){
			parea = parea + pA;
		} 
		double sarea = 0;
		for (Integer sA: statesAreas){
			sarea+=sA;  
		}
		return sarea+parea;
	}
}
