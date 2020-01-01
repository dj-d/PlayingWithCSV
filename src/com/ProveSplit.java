package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProveSplit {
	public static void main(String[] args) {
		ArrayList<String> rawList = new ArrayList<>();

		String s = "Le tradizioni | Paesi e culture";

		for (String a : s.split("\\|")) {
			rawList.add(a);
		}

		List<String> l = rawList.stream().distinct().collect(Collectors.toList());

		System.out.println(l.get(0));
	}
}
