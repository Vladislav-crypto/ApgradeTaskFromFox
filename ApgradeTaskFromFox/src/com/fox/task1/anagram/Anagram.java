package com.fox.task1.anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	private static final String DELIMETER = " ";

	public String reverseText(String text) {
		if (text == null) {
			throw new IllegalArgumentException("Shouldn't input null");
		}
		List<String> anagram = new ArrayList<>();
		for (String word : text.split(DELIMETER, 100)) {
			anagram.add(reverseWord(word));
		}
		return String.join(DELIMETER, anagram);
	}

	private String reverseWord(String word) {

		char[] result = word.toCharArray();
		int rightPointer = result.length - 1;
		int leftPointer = 0;

		while (leftPointer < rightPointer) {

			if (!Character.isAlphabetic(result[leftPointer])) {
				leftPointer++;
			} else if (!Character.isAlphabetic(result[rightPointer])) {
				rightPointer--;

			} else {
				char tmp = result[leftPointer];
				result[leftPointer] = result[rightPointer];
				result[rightPointer] = tmp;
				leftPointer++;
				rightPointer--;
			}

		}
		return String.valueOf(result);
	}
}
