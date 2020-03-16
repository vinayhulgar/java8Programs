
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Traversing List in Functional Way
 * 
 * Issues in Imperative way
 * 	1. for loop is sequential & difficult to parallelize
 *  2. These loops are non polymorphic
 *  3. At design level - code fails "Tell, Don't ask" principle
 */
public class ListTraversal {

	public static void main(String[] args) {
		final List<String> players = Arrays.asList("Virat","Rohit","Shikar","Rahul","Rishabh","Hardik","MSD");
		
		// Imperative Way
		for(int i=0; i< players.size();i++) {
			System.out.println(players.get(i));
		}
		
		players.forEach(new Consumer<String>() {

			@Override
			public void accept(final String name) {
				System.out.println(name);
			}
		});
		
		players.forEach(name -> System.out.println(name));
		
		// method reference
		players.forEach(System.out::println);
		
	}

}
