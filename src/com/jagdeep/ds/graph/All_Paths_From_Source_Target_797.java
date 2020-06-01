package com.jagdeep.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class All_Paths_From_Source_Target_797 {

    static List<List<Integer>> paths = new ArrayList<>();

    public static void main(String[] args) {
        int[][] graph = new int[][]{{1,2}, {3}, {3}, {}};
        List<List<Integer>> lists = allPathsSourceTarget(graph);
        System.out.println(lists);
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph, 0, graph.length - 1, new ArrayList<>());
        return paths;
    }


    public static void dfs(int[][] graph, int currentNode, int destination, List<Integer> currentPath) {

        if (currentNode == destination) {
            currentPath.add(currentNode);
            paths.add(new ArrayList(currentPath));
            currentPath.remove(currentPath.size() - 1);
            return;
        }


        int[] neighbors = graph[currentNode];
        currentPath.add(currentNode);

        //Its a DAG so we do not need to check for visited
        for (Integer neighbor : neighbors) {
            dfs(graph, neighbor, destination, currentPath);
        }

        currentPath.remove(currentPath.size() - 1);
    }
}

