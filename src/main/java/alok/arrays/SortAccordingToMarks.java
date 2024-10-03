package alok.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortAccordingToMarks {
    public static void main(String[] args) {
        Object arr[][] = {{"Ram", 10}, {"Shyam", 35}, {"Sachin", 5}, {"Bunty", 100}};

        Arrays.sort(arr, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return ((int)o2[1])  - (int)(o1[1]);
            }
        });

       for (Object[] object : arr){
           System.out.println(Arrays.toString(object));
       }
    }

}
