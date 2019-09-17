import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateComposition {

	public static void main(String[] args) {
		final List<String> items = Arrays.asList("Groovy", "Gradle","Micronut","Java","Kotlin");
		
		final List<String> list1 =
				items.stream()
				//.filter(s -> s.startsWith("Gr") || s.startsWith("M"))
				.filter(startsWith("Gr").or(startsWith("M")))
				.collect(Collectors.toList());
		System.out.println(list1);
		
		final List<String> list2 =
				items.stream()
				.filter(startsWith("Gr").and(smallerThan(8)))
				.collect(Collectors.toList());
		System.out.println(list2);
		
		final List<String> list3 =
				items.stream()
				.filter(Predicate.not(startsWith("Gr")).and(smallerThan(8)))
				.collect(Collectors.toList());
		System.out.println(list3);
	}
	
	private static Predicate<String> startsWith(final String begin){
		return s -> s.startsWith(begin);
	}
	
	private static Predicate<String> smallerThan(final int size){
		return s -> size >=s.length();
	}

}
