package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProveSplit {
	public static void main(String[] args) {
		ArrayList<String> categoryOld = new ArrayList<>();

		String s = "Stabilimenti balneari->Il mare,Strutture ricettive->Benessere,Food e beverage->I sapori,Food e beverage->Il mare";

		String[] split = s.split(",");

		for (String a : split) {
			String[] moreSplit = a.split("->");

			for (int i = 1; i < moreSplit.length; i += 2) {
				categoryOld.add(moreSplit[i]);
			}
		}

		List<String> category = categoryOld.stream().distinct().collect(Collectors.toList());

		System.out.println(category);
	}
}
