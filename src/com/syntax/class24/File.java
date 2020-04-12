package com.syntax.class24;

public abstract  class File {
	/*Create a class File that will have the following behaviors:
	 * open, edit, close.
	 * Edit and close are implemented method
	 * while open is an abstract.
	 * Create 3 subclasses: 
	 * JavaFile, WordFile, PDFFile
	 * that will provide specific implementation 
	 * of open behavior: Example: 
	 * to open .java file we need notepad++ or sublime text,
	 *to open .doc file we need Microsoft word to be installed etc
	 */

	abstract void open (); 
	void close() {System.out.println("Can be closed");}
	void edit () {System.out.println("Can be edited");}
}
class JavaFile extends File{
	void open () {
		System.out.println("to open .java file we need notepad++ or sublime text");
	}
}
class WordFile extends File{
	void open () {
		System.out.println("to open .doc file we need Microsoft word to be installed");
	}
}
class PDFFile extends File{
	void open() {
		System.out.println("to open .pdf file you need a copy of Adobe Acrobat Reader or an alternative PDF reader installed on your computer.");
	}
}
