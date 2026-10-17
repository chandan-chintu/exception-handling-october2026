package user.defined.custom.exception;

public class UserNotFoundException extends Exception{

    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
