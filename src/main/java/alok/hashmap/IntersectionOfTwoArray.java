package alok.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]  = {1,2,3,4,5,5};
        int arr2[] = {3,4,5,5,5,6,7};

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr1){
            map.put(x,map.getOrDefault(x , 0)  + 1);
        }

        for(int x : arr2){
            if(map.containsKey(x)){
                list.add(x);
            }
        }


        System.out.println(list);
    }
}
