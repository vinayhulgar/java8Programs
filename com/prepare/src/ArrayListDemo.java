
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import org.junit.Test;

public class ArrayListDemo {
	
	
//	@Test
	public void removeByElement() {
		List<String> sports = new ArrayList<>();
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Baseball");
		sports.add("Boxing");
		sports.add("Cycling");
		
		sports.remove("Baseball");
//		assertEquals(4, sports.size());
//		assertFalse(sports.contains("Baseball"));
	}
	
	
//	@Test
	public void removeByIndex() {
		List<String> sports = new ArrayList<>();
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Baseball");
		sports.add("Boxing");
		sports.add("Cycling");
		sports.remove(1);
//		assertEquals(4, sports.size());
//		assertFalse(sports.contains("Basketball"));
	}
	
//	@Test
	public void removeWhileIterating() {
		List<String> sports = new ArrayList<>();
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Baseball");
		sports.add("Boxing");
		sports.add("Cycling");
		
		/*Iterator<String> iterator = sports.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("Boxing"))
				iterator.remove();
		}*/
		sports.removeIf(p -> p.equals("Cycling"));
//		assertEquals(4, sports.size());
//		assertFalse(sports.contains("Cycling"));
	}
	
	

}
