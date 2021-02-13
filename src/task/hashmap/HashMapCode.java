package task.hashmap;
import java.util.*;

public class HashMapCode {

	public static void main(String[] args) {
		Map<String, String> countryCodeMap = new HashMap<>();
// A HashMap however, store items in "key/value" pairs,
// and you can access them by an index of another type		
		countryCodeMap.put("AU", "Australia");
		countryCodeMap.put("BH", "Bahamas");
		countryCodeMap.put("CA", "Canada");
		countryCodeMap.put("DK", "Dennmark");
		countryCodeMap.put("EY", "Egypt");
		countryCodeMap.put("FI", "Finland");
		countryCodeMap.put("GB", "Great Britain");
		countryCodeMap.put("HO", "Honduras");
		countryCodeMap.put("IR", "Ireland");
		countryCodeMap.put("RO", "Romania");
		
		Set<Map.Entry<String, String>> countryCodeMapEntries = countryCodeMap.entrySet();
		System.out.println("CountryCode entries : " + countryCodeMapEntries);
		
		String codeState = countryCodeMap.remove("GB"); 
        if(codeState == null) {
            System.out.println("GB is not here!");
        } else {
        	System.out.println();
            System.out.println("Removed Great Britain from mapping.");
            System.out.println("Country left here: ");
            
            System.out.println(countryCodeMapEntries);
        }
	}
}
