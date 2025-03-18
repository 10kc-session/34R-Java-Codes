package com.library.books;

public class Library {
	private String libraryName;
	private int totalBooks;
	
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	public String getLibraryName() {
		return this.libraryName;
	}
	
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	
	public int getTotalBooks() {
		return this.totalBooks;
	}
	
	public void showLibraryDetails() {
		System.out.println("Library Name : " + libraryName);
		System.out.println("Library Total Books : " + totalBooks);
	}
}
