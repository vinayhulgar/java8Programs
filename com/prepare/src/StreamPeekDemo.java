import java.util.Arrays;
import java.util.List;

public class StreamPeekDemo {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,12,5,6,7,13);
		/*Integer result = null;
		for(int i :myList){
			if(i>10 && i%2 ==0){
				result = i*2;
				break;
			}
		}
		if(result!=null){
			System.out.println("The value is "+result);
		}
		else{
			System.out.println("No Value Found");
		}*/
		
		// Using Streams
		System.out.println(myList.stream()
				.peek(e -> System.out.println("processing"+e))
				.filter(e -> e>10)
				.filter(e -> e%2 ==0)
				.map(e -> e*2)
				.findFirst()
				.map(e -> "The value is "+e)
				.orElse("No Value Found"));
		
		
		
	}
}
