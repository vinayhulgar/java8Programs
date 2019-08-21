import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
  Finding Names which starts with lets say N Using predicate
  
*/
public class FindingNamesStartsWith {

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brain","Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> editors = Arrays.asList("Brain","Jackie", "John", "Mike");
		final List<String> comrades = Arrays.asList("Kate","Ken", "Nick", "Paula", "Zach");
		
		final Predicate<String> startsWithN = n -> n.startsWith("N");
		
		
		final long countFriendStartN =
				friends.stream().filter(startsWithN).
				count();
		
		final long countEditorStartN =
				editors.stream().filter(startsWithN).
				count();
		
		final long countComradesStartN =
				comrades.stream().filter(startsWithN).
				count();
		
		System.out.println(countFriendStartN);
		System.out.println(countEditorStartN);
		System.out.println(countComradesStartN);
		
	}

}
