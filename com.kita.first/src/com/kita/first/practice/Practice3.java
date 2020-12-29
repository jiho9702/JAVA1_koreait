package com.kita.first.practice;

public class Practice3 {

	public static void main(String[] args) {
		//n1()n2 
		int n1 =10;
		int n2 =3;
/*		int result1 = n1+=n2;
		n1=10;
		int result2 = n1-=n2;
		n1=10;
		int result3 = n1*=n2;
		n1=10;
		int result4 = n1/=n2;
		n1=10;
		int result5 = n1%=n2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
*/
		int result0[] = {};
		for(int i=0; i<5; i++) {
			if(i==0) {
				result0[i] = n1+=n2;
				n1 = 10;
			}
			else if(i==1) {
				n1 = 10;
				result0[i] = n1-=n2;
				
			}
			else if(i==2) {
				result0[i] = n1*=n2;
				n1 = 10;
			}
			else if(i==3) {
				result0[i] = n1/=n2;
				n1 = 10;
			}
			else{
				result0[i] = n1%=n2;			
			}
		}
		for(int i=0; i<5; i++) {
			System.out.printf("%d", result0[i]);
	
		}
	}
}


