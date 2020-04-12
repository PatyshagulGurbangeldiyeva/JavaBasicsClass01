package com.syntax.class09;

public class o6TaskNumbers4x4 {

	public static void main(String[] args) {
		// PRINT :
		// 12345
		// 12345
		// 12345
		// 12345
		// lets print rows then colums
		
		for (int a=1;a<=4;a++) {  
			for (int b=1;b<=5;b++) {
				System.out.print(b);// eger buraya b yererine (a) yazarsak cikti : 11111/22222/....
			}System.out.println();// hic bir sey yazma cunku sadece inner loop tekrarlanacak
			                      // yazarsan out loop da yazilir
			                      // 123451 (sonunda bir geldi cunku en son printe (a) yazdin!!!
		}
	}

}
