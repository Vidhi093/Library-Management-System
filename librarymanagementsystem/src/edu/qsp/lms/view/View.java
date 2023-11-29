package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controller.Controller;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	
	static {
		System.out.println("- - - - - WELCOME TO LIBRARY MANAGEMENT SYSTEM - - - - -");
		System.out.println("Enter name of library : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.println("Enter address of library : ");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.println("Enter pincode : ");
		int libraryPincode = myInput.nextInt();
		myInput.nextLine();
		library.setPincode(libraryPincode);
		
	}
	
	public static void main(String[] args) {
		do {
			System.out.println("Select operation to perform : ");
			System.out.println("1.Add Book\n2.Remove Book\n3.Update Book\n4.Get Book by Name\n5.Get All Books\n0.Exit");
			System.out.println("Enter digit respective to desired option : ");
			int userChoice = myInput.nextInt();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("- - - - - EXITED - - - - -");
				System.exit(0);
				break;
			case 1:
				Book book1 = new Book();
				System.out.println("Enter book name : ");
				book1.setBookName(myInput.nextLine());
				System.out.println("Enter book author : ");
				book1.setBookAuthor(myInput.nextLine());
				System.out.println("Enter book price : ");
				book1.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				System.out.println("Enter publication : ");
				book1.setPublication(myInput.nextLine());
				//
				controller.addBook(book1);
				
				break;
			case 2:
				System.out.println("Enter name of the book to be removed : ");
				String bookToBeRemoved = myInput.nextLine();
				boolean verifyRemoveBook = controller.removeBook(bookToBeRemoved);
				if(verifyRemoveBook) {
					System.out.println("Book removed");
				}else {
					System.out.println("Book does not exist in the library");
				}
				
				break;
			case 3:
				Book book3 = new Book();
				System.out.println("Enter name of the book to update : ");
				String bookToUpdate = myInput.nextLine();
				book3.setBookName(bookToUpdate);
				System.out.println("Enter new price : ");
				double newPrice = myInput.nextDouble();
				book3.setBookPrice(newPrice);
				if(controller.updateBookPriceByBookName(book3)) {
					System.out.println("Book price updated");
				}else {
					System.out.println("Book does not exist in the library");
				}
				break;
			case 4:
				System.out.println("Enter book name : ");
				String bookToGet = myInput.nextLine();
				Book book = controller.searchBook(bookToGet);
				if(book!=null) {
					System.out.println(book);
				}else {
					System.out.println("Book does not exist in the library");
				}
				break;
			case 5:
				System.out.println(controller.getAllBooks());

				break;

			default:
				System.out.println("- - - - - INVALID - - - - -");
				break;
			}
		} while (true);
	}
}
