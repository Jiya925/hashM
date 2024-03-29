package westview.ds;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap s = new HashMap<String, Integer>();
		HashMap c = new HashMap<String, Integer>();
		
		HashMap m = new HashMap<String, String>();
		
		//adding entries to our map ("dictionary")
		m.put("nice", "meam");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		//query the map for a non-existing key
		System.out.println(m.get("sunny"));
		
		//query map for smth that exists
		System.out.println(m.get("motivated"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		//list of fav food
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Cake");
		food.add("Boba");
		
		m2.put("Jiya", food);
		
		System.out.println(m2.get("Jiya"));
		
		String state = "";
	    String city = "";
		
		//Get the scanner going to read the csv file
		try {

		    Scanner scanner = new Scanner(new File("covid417.csv"));

		    int countS = 0;
		    int countC = 0;
		    
		    scanner.nextLine();
		    
		    while(scanner.hasNextLine()) {
		    	String[] row = scanner.nextLine().split(",");

		    	
		    	countS = Integer.valueOf(row[2]);
		    	countC = Integer.valueOf(row[2]);
		    	
		    	//hashmap with total confirmed for each state/city
		    	// check if already has state/city, if it does update count then replace
		    	//if not put new one
		    	
		    	//counts confirmed cases total for states
		    	if(s.containsKey(row[1])) {
		    		countS += (int)s.get(row[1]);
		    		s.replace(row[1], countS);
		    	}
		    	else {
		    		s.put(row[1], countS);
		    	}
		    	
		    	//counts confirmed cases total for each city
		    	if(c.containsKey(row[0])) {
		    		c.replace(row[0] +", " + row[1], countC);
		    	}
		    	else {
		    		c.put(row[0] +", " + row[1], countC);
		    	}
		    	

		    	
		    }
		    scanner.close();
		    
		    //User input 
		    while(true){
		    	
		    Scanner userInput = new Scanner(System.in);
		    System.out.println("Please enter a State");
		    
		    state = userInput.nextLine();
		    state = state.substring(0, 1).toUpperCase() + state.substring(1).toLowerCase();
		    System.out.println("The confirmed number of cases in " +state+" is : " + s.get(state));
		    
		    System.out.println(". \n Please enter a city: \n");
		    
		    city = userInput.nextLine();
		    city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
		    System.out.println("The confirmed number of cases in " + city +", "+state+" is : " + c.get(city+", "+state));
		    	
		    }
		    
		} catch (FileNotFoundException e) {

			System.out.println(e);
			
		}

	}

}
