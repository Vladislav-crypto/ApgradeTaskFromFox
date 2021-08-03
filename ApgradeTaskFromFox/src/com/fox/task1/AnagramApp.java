package com.fox.task1;

import com.fox.task1.anagram.Anagram;

import java.util.Scanner;

public class AnagramApp {
	private static final String INPUT_MESSAGE = "Input anagram to reverse:";
	private static final String OUTPUT_MESSAGE = "Reverse anagram:";

	public static void main(String[] args) {
		AnagramApp app = new AnagramApp();
		Anagram anagram = new Anagram();
		String text = app.readInputAnagram();
		String result = anagram.reverseText(text);
		System.out.println(OUTPUT_MESSAGE + result);
	}

	private String readInputAnagram() {
		System.out.println(INPUT_MESSAGE);
		try (final Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}

	}
}
