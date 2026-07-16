import java.util.Optional;

// Custom Exception
class InvalidEmployeeException extends RuntimeException {

    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

public class InvalidEmployeeExceptionDemo {

    public static void main(String[] args) {

        String emp = null;

        Optional<String> obj = Optional.ofNullable(emp);

        try {
            System.out.println(obj.orElseThrow(() ->
                    new InvalidEmployeeException("Employee Not Found")));
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}