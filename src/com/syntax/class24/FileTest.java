package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File java=new JavaFile();
		File word=new WordFile();
		File pdf=new PDFFile();
		
		java.open();
		java.close();
		java.edit();
		
		System.out.println();
		
		word.open();
		word.close();
		word.edit();
		
		System.out.println();
		
		pdf.open();
		pdf.close();
		pdf.edit();
	}

}
