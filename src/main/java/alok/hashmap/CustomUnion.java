package alok.hashmap;

import java.util.HashMap;
import java.util.Objects;

//{1=1, 2=2, 3=1, 4=1, 5=3, 6=1, 7=1}

public class CustomUnion {
    public static void main(String[] args) {
        int arr1[]  = {1,2,3,4,5,5};
        int arr2[] = {3,4,5,5,5,6,7,2,2};

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for (int x : arr1){
            map1.put(x,map1.getOrDefault(x,0) + 1);
        }

        for (int x : arr2){
            if(map2.containsKey(x)){
                map2.put(x,map1.get(x) + 1);
            }else{
                map2.put(x,1);
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : map1.keySet()){
            map.put(x,map1.get(x));
        }

        for (int x : map2.keySet()){
            int max  = -1;
            if (!Objects.isNull(map1.get(x)) && map1.get(x) > map2.get(x)) {
                map.put(x,map1.get(x));
            }else{
                map.put(x,map2.get(x));
            }
        }

        System.out.println(map);

    }
}
