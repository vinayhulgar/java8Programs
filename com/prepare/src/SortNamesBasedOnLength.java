import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sorting names Based on Name Length
 *
 */
public class SortNamesBasedOnLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "David", "Raghuram");
		Collections.sort(names, (first, second) -> second.length() - first.length());
		System.out.println(names);
	}
}
