import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapsWithStreamsDemo {

	public static void main(String[] args) {
		Map<String,String> books = new HashMap<>();
		books.put("985-9873267-998", "Design Patters");
		books.put("985-9873253-998", "Java 8 In Action");
		books.put("985-9873567-998", "Effective Java");
		books.put("985-9873565-998", "Effective Java");
		
		// retrieving match
		Optional<String> optionalIsbn = books.entrySet().stream()
				.filter(e -> "Effective Java".equalsIgnoreCase(e.getValue()))
				.map(Map.Entry :: getKey)
				.findFirst();
		if(optionalIsbn.isPresent())
		System.out.println(optionalIsbn);
		
		// retrieving multiple
		List<String> isbncodes = books.entrySet().stream()
				.filter(e -> e.getValue().startsWith("Effective Java"))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(isbncodes);
		
		// Getting Map's values using streams
		List<String> titles = books.entrySet().stream()
				.filter(e -> e.getKey().startsWith("985"))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
		System.out.println(titles);
		
	}

}
