package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Permutation_backtracking {

	public static void main(String[] args) {
		String str = "abc";
		List<Character> listTemp = new ArrayList<>();
		List<List<Character>> resList = new ArrayList<>();
		permutation(str.toCharArray(), listTemp, resList);
		System.out.println(resList);
	}

	private static void permutation(char[] charArray, List<Character> listTemp, List<List<Character>> resList) {

		if(listTemp.size()==charArray.length) {
			resList.add(new ArrayList<>(listTemp));
			return;
		}
		for (int i = 0; i < charArray.length; i++) {

			if (listTemp.contains(charArray[i])) {
				continue;
			}
			// add to temp list
			listTemp.add(charArray[i]);
			// backtracking
			permutation(charArray, listTemp, resList);
			// remove from temp list
			listTemp.remove(listTemp.size() - 1);
		}
	}

}
