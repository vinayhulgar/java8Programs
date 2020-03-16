import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*
  Program to group state by country

*/
public class StateCountryVO {

	public static void main(String[] args) {
		// Map of StateCountry
		Map<String, String> tempMap = new HashMap<String, String>();
		tempMap.put("Karnataka","India");
		tempMap.put("Goa","India");
		tempMap.put("Kerala","India");
		tempMap.put("California","USA");
		tempMap.put("Nevada","USA");
		Map<String, List<String>> result =  tempMap.entrySet().stream().collect(Collectors.groupingBy(
				Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));	
		System.out.println(result);
	}
}
