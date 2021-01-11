package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		
		
		int[][] arr = {
				{90, 100, 88}, //국어
				{34, 99, 45},  //수학
				{89, 65, 74},  //영어		
		};
		
		//국어합계 : ? 평균 : ?
		//수학합계 : ? 평균 : ?
		//영어합계 : ? 평균 : ?
		//전체합계 : ? 평균 : ?
		
		
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[clsArr.length];
		int total = 0;
		float totalAvg = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s합계 : %d  평균 : %.1f\n", clsArr[i], sumArr[i], sumArr[i]/(float)arr.length);
		}
		
		for(int i=0; i<clsArr.length; i++) {
			total += sumArr[i];
			totalAvg = sumArr[i]/(float)clsArr.length;
		}
		
		System.out.printf("전체합계 : %d  전체평균 : %.1f", total, totalAvg);
		
	}
}
