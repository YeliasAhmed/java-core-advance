package exceptions.mixedTypeException.libraryManagement;

public class BookAlreadyReturnedException extends Exception{
    public BookAlreadyReturnedException(String message) {
        super(message);
    }
}
