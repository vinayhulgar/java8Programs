import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*

To Print Array or List with Index in front.

*/
public class JavaArrayWithIndex {

	public static void main(String[] args) {
		String [] names = {"Java", "Node", "JavaScript","Rust", "Go"};
		
		List<String> collect = IntStream.range(0, names.length)
				.mapToObj(index -> index+ ":" +names[index])
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

	}

}
