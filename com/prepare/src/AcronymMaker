import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Make a program that converts an input to its acronym. 
Your input is guaranteed to have only letters and spaces. 
The input will have exactly one space between words. You must output the acronym of the input.

*/
public class AcronymMaker {
	
	private static final List<String> STOP_WORDS = Arrays.asList("AND","OR","BY","OF");
	
	public static String getAcronym(final String input) {
		return Arrays.stream(input.toUpperCase().split("\\s"))
				.filter(word -> !STOP_WORDS.contains(word))
				.map(w -> String.valueOf(w.charAt(0)))
				.collect(Collectors.joining(" "));
	}
	
	public static void main(String [] args) {
		System.out.println(getAcronym("NASA AND ISRO"));
	}

}
