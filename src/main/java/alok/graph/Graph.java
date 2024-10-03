package alok.graph;

import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 3;
        int e = 3;

        int edges[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
            int sv = in.nextInt();
            int ev = in.nextInt();
            edges[sv][ev] = 1;
        }

        print(edges);
    }

    private static void print(int[][] edges) {
        boolean []visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if(!visited[i]){
                print(edges,i,visited);
            }
        }
    }

    private static void print(int[][] edges, int sv, boolean[] visited) {

    }
}
