public class DaysInMonth {

	public static void main(String[] args) {
		Function<Integer, Integer> dim = new Function<Integer, Integer>(){
			
			public Integer apply(Integer month) {
				return new Integer[] { 31, 28, 31, 30, 31, 30,
						31,31,30,31,30,31
				}[month];				
			}
		};
		System.out.println(dim.apply(3));
		System.out.println(dim.apply(7));
		
	}

}
