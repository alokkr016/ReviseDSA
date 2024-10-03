package alok.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class SaveUniqueElement {
    public static void main(String[] args) {
        String[] arr = {"alok","sachin","aryan","alok","bunty","aryan"};
        Map<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
    }
}
