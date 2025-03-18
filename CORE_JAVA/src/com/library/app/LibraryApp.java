package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		Librarian librarian = new Librarian();
		Library library = new Library();
		
		library.setLibraryName("Gandhi Library");
		library.setTotalBooks(500);
		library.showLibraryDetails();
		
		System.out.println("=======================");
		
		librarian.setLibrarianName("Nehru");
		librarian.setYearsOfExperience(23);
		librarian.showLibrarianInfo();
	}
}
