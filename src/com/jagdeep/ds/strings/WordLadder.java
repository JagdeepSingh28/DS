package com.jagdeep.ds.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder {
	/*
	 * http://www.programcreek.com/2012/12/leetcode-word-ladder/
	 */

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));	
		
		System.out.println(ladderLength(start, end, dict));
	}

	static class WordNode {
		String word;
		int numSteps;

		public WordNode(String word, int numSteps) {
			this.word = word;
			this.numSteps = numSteps;
		}
	}

	public static int ladderLength(String beginWord, String endWord,
			Set<String> wordDict) {
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(beginWord, 1));

		wordDict.add(endWord);

		while (!queue.isEmpty()) {
			WordNode top = queue.remove();
			String word = top.word;

			if (word.equals(endWord)) {
				return top.numSteps;
			}

			char[] arr = word.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					char temp = arr[i];
					if (arr[i] != c) {
						arr[i] = c;
					}

					String newWord = new String(arr);
					if (wordDict.contains(newWord)) {
						queue.add(new WordNode(newWord, top.numSteps + 1));
						wordDict.remove(newWord);
					}

					arr[i] = temp;
				}
			}
		}

		return 0;
	}

}
