package westview.ds;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
		//Get the scanner going to read the csv file
		try {

		    Scanner scanner = new Scanner(new File("covid417.csv"));
		    HashMap confirmed = new HashMap<String, Integer>();
		    //HashMap states = new HashMap<String, ArrayList<City>>();
		    //ArrayList<City> cities = new ArrayList<City>();
		    //String state = "";
		    int countCA = 0;
		    int count = 0;
		    
		    scanner.nextLine();
		    
		    while(scanner.hasNextLine()) {
		    	String[] row = scanner.nextLine().split(",");
		    	City city = new City();
		    	
		    	//count confirmed for CA
		    	if(row[1].equals("California")){
		    		countCA++;
		    	}
		    	
		    	count = Integer.valueOf(row[2]);
		    	//hashmap with total confirmed for each state
		    	// check if already has state, if it does update count then replace
		    	//if not put new one
		    	if(confirmed.containsKey(row[1])) {
		    		count += (int)confirmed.get(row[1]);
		    		confirmed.replace(row[1], count);
		    	}
		    	else {
		    		confirmed.put(row[1], count);
		    	}
		    	
		    	
		    	
		    	//city.setName(row[0]);
		    	//city.setConfirmed(Integer.valueOf(row[2]));
		    	//city.setDeaths(Integer.valueOf(row[3]));
		    	//city.setRecovered(Integer.valueOf(row[4]));
		    	//city.setActive(Integer.valueOf(row[5]));
		    	//if(row[0].equals(state)) {
		    		
		    	//}
		    	//states.put(row[1], city);
		    	//state = row[1];
		    	
		    	//System.out.println(scanner.next());
		    	
		    }
		    scanner.close();
		    
		    System.out.println("total entries for CA confirmed: " + countCA);
		    System.out.println("total confirmed for CA: " +confirmed.get("California"));
		    
		    //User input 
		    
		    Scanner userInput = new Scanner(System.in);
		    System.out.println("Please enter a State");
		    
		    String state = userInput.nextLine();
		    
		    System.out.println(". \n Please enter a city: \n");
		    
		    
		    while(true){
		    	
		    }
		    
		} catch (FileNotFoundException e) {

			System.out.println(e);
			
		}

	}

}
