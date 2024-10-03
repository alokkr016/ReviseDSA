package alok.priorityqueue;

import java.util.PriorityQueue;

public class SortKsortedArray {
    public static void main(String[] args) {
        int arr[][] = {{1,4,6},{2,5,8},{3,9,10}};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                priorityQueue.add(arr[i][j]);
            }
        }
        PriorityQueue<Integer> priorityQueueReversed = new PriorityQueue<>((a ,b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                priorityQueueReversed.add(arr[i][j]);
            }
        }

        System.out.println(priorityQueue);
        System.out.println(priorityQueueReversed);
    }
}
