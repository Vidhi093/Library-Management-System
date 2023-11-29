# Library-Management-System

### `Book` Class

#### Description:
Represents a book entity with attributes such as name, author, price, and publication details.

#### Fields:
- `bookName` (String): The name of the book.
- `bookAuthor` (String): The author of the book.
- `bookPrice` (double): The price of the book.
- `publication` (String): The publication details of the book.

#### Methods:
- `getBookName(): String`: Retrieves the name of the book.
- `setBookName(String bookName)`: Sets the name of the book.
- `getBookAuthor(): String`: Retrieves the author of the book.
- `setBookAuthor(String bookAuthor)`: Sets the author of the book.
- `getBookPrice(): double`: Retrieves the price of the book.
- `setBookPrice(double bookPrice)`: Sets the price of the book.
- `getPublication(): String`: Retrieves the publication details of the book.
- `setPublication(String publication)`: Sets the publication details of the book.
- `toString(): String`: Provides a string representation of the book object.

### `Library` Class

#### Description:
Represents a library entity with details such as name, address, pin code, and a collection of books.

#### Fields:
- `libraryName` (String): The name of the library.
- `libraryAddress` (String): The address of the library.
- `pincode` (int): The pin code of the library.
- `books` (List<Book>): The collection of books in the library.

#### Methods:
- `getLibraryName(): String`: Retrieves the name of the library.
- `setLibraryName(String libraryName)`: Sets the name of the library.
- `getLibraryAddress(): String`: Retrieves the address of the library.
- `setLibraryAddress(String libraryAddress)`: Sets the address of the library.
- `getPincode(): int`: Retrieves the pin code of the library.
- `setPincode(int pincode)`: Sets the pin code of the library.
- `getBooks(): List<Book>`: Retrieves the collection of books in the library.
- `setBooks(List<Book> books)`: Sets the collection of books in the library.
- `toString(): String`: Provides a string representation of the library object.

### `Controller` Class

#### Description:
Handles operations related to book management within the library.

#### Methods:
- `addBook(Book book)`: Adds a book to the library.
- `searchBook(String bookName): Book`: Searches for a book by its name.
- `removeBook(String bookName): boolean`: Removes a book from the library by its name.
- `updateBookPriceByBookName(Book refBook): boolean`: Updates the price of a book by its name.
- `getAllBooks(): List<Book>`: Retrieves all books in the library.

### `View` Class

#### Description:
Provides a console-based user interface for interacting with the library management system.

#### Methods:
- `main(String[] args)`: Runs the main menu loop, allowing users to perform operations such as adding, removing, updating, and retrieving books from the library.

This documentation provides an overview of each class's purpose, fields, and methods, in understanding the functionalities and interactions within the library management system.
