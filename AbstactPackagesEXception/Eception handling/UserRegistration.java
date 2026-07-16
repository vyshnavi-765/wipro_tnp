class InvalidCountryException extends Exception {

    InvalidCountryException(String msg) {
        super(msg);
    }
}
public class UserRegistration {

    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        UserRegistration u = new UserRegistration();

        try {
            u.registerUser("Mini", "India");
            // u.registerUser("Mickey","US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}