package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProveSplit {
	public static void main(String[] args) {
		ArrayList<String> categoryOld = new ArrayList<>();

		String s = "I sapori | Le tradizioni | Paesi e culture | La montagna | Vacanze nella natura";

		String[] split = s.split("\\|");

		for (String a : split) {
//			String[] moreSplit = a.split("->");
			categoryOld.add(a);
//			for (int i = 1; i < moreSplit.length; i += 2) {
//				categoryOld.add(moreSplit[i]);
//			}
		}

		List<String> category = categoryOld.stream().distinct().collect(Collectors.toList());

		System.out.println(category);
	}
}
