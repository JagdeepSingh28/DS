package com.jagdeep.ds.leet;

import java.util.*;

public class SortCharactersByFrequency_451 {

    public static void main(String[] args) {
        String s = "Abab";

        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {

        StringBuilder result = new StringBuilder();

        HashMap<Character, Integer> frequencyCounter = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyCounter.put(c,frequencyCounter.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> characters = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return frequencyCounter.get(b) - frequencyCounter.get(a);
            }
        });


        characters.addAll(frequencyCounter.keySet());

        while(!characters.isEmpty()){
            char current = characters.remove();
            for (int i = 0; i < frequencyCounter.get(current); i++) {
                result.append(current);
            }

        }

        return result.toString();


//        Set<Map.Entry<Character, Integer>> entries = frequencyCounter.entrySet();
//
//        Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
//                return b.getValue().compareTo(a.getValue());
//            }
//        };
//
//        List<Map.Entry<Character, Integer>> listOfEntries = new ArrayList<>(entries);
//        Collections.sort(listOfEntries, comparator);
//
//        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>(listOfEntries.size());
//
//        for (Map.Entry<Character, Integer> listOfEntry : listOfEntries) {
//            linkedHashMap.put(listOfEntry.getKey(), listOfEntry.getValue());
//        }
//
//        Set<Map.Entry<Character, Integer>> finalEntries = linkedHashMap.entrySet();
//
//        for(Map.Entry<Character, Integer> finalEntries1 : finalEntries){
//            for (int i = 0; i < finalEntries1.getValue(); i++) {
//                result.append(finalEntries1.getKey());
//            }
//        }
//
//        return result.toString();
    }
}
