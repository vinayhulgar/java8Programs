
//import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.junit.Test;

public class MergingStreamsDemo {

//	@Test
	public void streamConcat() {
		Stream<Integer> stream1 = Stream.of(1,3,5);
		Stream<Integer> stream2 = Stream.of(2,4,6);
		
		Stream<Integer> resultingStream = Stream.concat(stream1, stream2);
//		assertEquals(Arrays.asList(1,3,5,2,4,6),resultingStream.collect(Collectors.toList()));
		
	}
	
//	@Test
	public void mergeMultiple() {
		Stream<Integer> stream1 = Stream.of(1,3,5);
		Stream<Integer> stream2 = Stream.of(2,4,6);
		Stream<Integer> stream3 = Stream.of(18,15,36);
		
		Stream<Integer> resultingStream = Stream.concat(Stream.concat(stream1, stream2), stream3);
//		assertEquals(Arrays.asList(1,3,5,2,4,6,18,15,36),resultingStream.collect(Collectors.toList()));
	}
	
//	@Test
	public void usingFlatMap() {
		Stream<Integer> stream1 = Stream.of(1,3,5);
		Stream<Integer> stream2 = Stream.of(2,4,6);
		Stream<Integer> stream3 = Stream.of(18,15,36);
		Stream<Integer> stream4 = Stream.of(99);
		
		Stream<Integer> resultingStream = Stream.of(
				stream1, stream2, stream3, stream4)
				.flatMap(i -> i);
//		assertEquals(Arrays.asList(1,3,5,2,4,6,18,15,36,99),resultingStream.collect(Collectors.toList()));
	}

}
