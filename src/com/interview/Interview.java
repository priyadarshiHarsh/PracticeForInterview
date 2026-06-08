package com.interview;

import java.util.Stack;

public class Interview {

	public static void main(String... args){
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		maxSubArray(arr);
	}

	private static void maxSubArray(int[] arr) {
		int max=0;
		int finalMax=0;
		int start=0;
		int end =0;
		
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			max+=arr[i];
			
			if(max>0) {
				st.push(arr[i]);
			}
			if(max<=0) {
				st.clear();
			}
		}
		System.out.println(st);
	}

}