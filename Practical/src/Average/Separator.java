package Average;

import java.util.ArrayList;
import java.util.List;

public class Separator {
    int [] array;

    public Separator(int[] array) {
        this.array = array;
    }

    Integer[] even(){
        List<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                newArray.add(array[i]);
            }
        }
        Integer[] a = newArray.toArray(new Integer[0]);
        return a;
    }

    Integer[] odd(){
        List<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                newArray.add(array[i]);
            }
        }
        Integer[] a = newArray.toArray(new Integer[0]);
        return a;

    }

}
