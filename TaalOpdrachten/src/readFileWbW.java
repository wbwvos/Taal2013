import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class readFileWbW {
	

	public ArrayList<String> readIt(String file){
		ArrayList<String> words = new ArrayList<String>();
	    Scanner sc2 = null;
	    long begin = System.currentTimeMillis();
	    try {
	        sc2 = new Scanner(new File(file));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	        while (s2.hasNext()) {
	            words.add(s2.next());
	        }
	    }
	    long end =  System.currentTimeMillis();
	    long time = end - begin;
	    System.out.println(words.size() + " words put in ArrayList in: " + time + " Milliseconds");
	    return words;
	}
}
