import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static int simulateTimeConsumingComputation(int number){
		try{
			Thread.sleep(1000);
		}
		catch(Exception ex){}
		return number*2;
	}
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream()
		.parallel()
		.map(ParallelStreamDemo:: simulateTimeConsumingComputation)
		.forEachOrdered(System.out::println);
	}
}
