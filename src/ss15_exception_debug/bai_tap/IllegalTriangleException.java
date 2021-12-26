package ss15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}