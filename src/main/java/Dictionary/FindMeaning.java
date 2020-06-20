package Dictionary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class FindMeaning {
	
	
@Test	
public void findMeaning() {	
		//create hashmap to store key-value pair for the given text file	
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		  // create Arraylist one and store first key's two values
		   List<String> One = new ArrayList<String>();
		   
		   // create Arraylist one and store 2nd key's two values
		   List<String> Two = new ArrayList<String>();
		    
		    Properties prop = new Properties();
		    try {
				InputStream input = new FileInputStream("C:\\Users\\14693\\eclipse-workspace-AutomationPracticalExam\\FinalTakeHomeExam\\Data\\config.properties");
				prop.load(input);
				//create string Array to get both values of one key
				String[] One1 = prop.getProperty("Apple").split(",");
				//adding item to ArrayList
				One.add(One1[0]);
				One.add(One1[1]);
				
				String[] Two1 = prop.getProperty("Table").split(",");
				Two.add(Two1[0]);
				Two.add(Two1[1]);
											

			} catch (IOException e) {
				e.printStackTrace();

			}

		    
		    List<String> Three = new ArrayList<String>();
		    Three.add(prop.getProperty("Orange"));
		    Three.add("");
		   

		    // put values into map
		    map.put("Apple", One);
		    map.put("Table", Two);
		    map.put("Orange", Three);
		    
		    
		    //converting to a set which has no key, value only element
		    Set<Entry<String,List<String>>> entrySet = map.entrySet();
		    
		    //now converting set to ArrayList to print by index
		    ArrayList<Entry<String,List<String>>> listOfEntry = new ArrayList<Entry<String,List<String>>>(entrySet);
		    
		    //for-each loop to access each item of arraylist 
		    for (Entry<String, List<String>> entry : listOfEntry) 
	        { 
	            System.out.println(entry.getKey());
	            System.out.println(entry.getValue().get(0));
	            System.out.println(entry.getValue().get(1)); 
	            
	        }	    
		    
		    System.out.println("===================================");
		    System.out.println("Random Number Question");
		 // create instance of Random class 
	        Random rand = new Random(); 
	        System.out.println("Give me an integer?");
	        Scanner input = new Scanner(System.in);
	        int N = input.nextInt();
	        
	        
	        //int N = 300;
	       
	        //creating TreeSet to hold the value with no duplicate
	        TreeSet<Integer> rn = new TreeSet<Integer>();
	        
	        //generating 500 random numbers from range 100 to 1000 with no duplicate
	        while(rn.size()<500) {
			int rand_int1 = rand.nextInt((1000-100) + 1)+100; //range from 200 – 1000
	    	rn.add(rand_int1);
	        }
	        
	        //printing TreeSet
	        System.out.println("500 Random numbers are  =" + rn);
	        System.out.println("size of the TreeSet =" + rn.size());
	        
	  	
	        //converting into array to print nth smaller element
	  	    Object[] myrn = rn.toArray();
	        System.out.println(N + "th smallest number is " + myrn[N-1]);
	        
		}
		    
		   
		
}
		
				



