package arrays;

import java.util.Arrays;

public class CountOccurences {

    public static void main(String [] args){
            int [] numbers = {1,3,4,5,6,7,8,9,11,1,4,5,8,22,34,22, 66,45,22,13,49,22};
            int value = 22;
            System.out.println(Arrays.stream(numbers)
            .filter(number -> number == value)
            .count()
            );
    }

}