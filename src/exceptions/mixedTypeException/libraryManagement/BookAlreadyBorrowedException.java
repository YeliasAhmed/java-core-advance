package exceptions.mixedTypeException.libraryManagement;

public class BookAlreadyBorrowedException extends Exception{
    public BookAlreadyBorrowedException(String message) {
        super(message);
    }
}