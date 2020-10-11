package lists;


import java.util.List;

public class LastElementOfList {


public static <T> T last(List<T> elements){
    int numberOfelements = elements.size();
    return elements.get(numberOfelements-1);
} 



}
