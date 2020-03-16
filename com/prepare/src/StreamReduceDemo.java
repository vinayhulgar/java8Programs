
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Implementation Of Reduce method
 *
 */
public class StreamReduceDemo {

	public static void main(String[] args) {
		findLongestWord();
		findSumOfAllNumbers();
		findProductOfAllNumbers();
		combineString();
	}

	private static void combineString() {
		String [] array = {"Hello", "Lambda", "!"};
		Optional<String> combined = Arrays.stream(array)
				.reduce((str1, str2) -> str1+"-"+str2);
		if(combined.isPresent())
			System.out.println(combined);
	}

	/**
	 * To find product of all elements in given range excluding the rightmost element
	 */
	private static void findProductOfAllNumbers() {
		int product = IntStream.range(2, 8)
				.reduce((num1 , num2) -> num1 * num2)
				.orElse(-1);
		System.out.println("Product of all numbers: "+product);
	}

	private static void findSumOfAllNumbers() {
		List<Integer> numbers = Arrays.asList(12,45,67,89,13,66,67);
		int sum = numbers.stream()
				.reduce(0,(ele1, ele2) -> ele1+ele2);
		System.out.println("Sum of all Numbers: "+sum);
	}

	/**
	 * The lambda expression passed to reduce() method takes two strings and returns longest string.
	 * The result of the reduce() method is optional because the list can be empty.
	 */
	private static void findLongestWord() {
		List<String> words = Arrays.asList("Rohit","Jack","Raguveer","Ben","John");
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length()> word2.length()? word1 : word2);
		longestString.ifPresent(System.out::println);
	}

}
