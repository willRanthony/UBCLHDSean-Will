package UserPackage;

public class NoSuchUserException extends Exception {
    public NoSuchUserException(String message) {
        super(message);
    }
}