package github.com.sebCzabak.StudentsManagmentSystem.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(final String message) {
        super(message);
    }
}
