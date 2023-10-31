import java.util.Scanner;

public class UserRegistration {
    public static boolean validateFullName(String fullName) {
        String regex = "^[A-Z][a-zA-Z]*(\\s[A-Z][a-zA-Z]*)?$";
        return fullName.matches(regex);
    }

    public static boolean validateEmail(String email) {
        String regex = "^(?=.*[A-Za-z0-9])([-_.]*[A-Za-z0-9]+)*@[A-Za-z]+(\\.[A-Za-z]{2,})+$";
        return email.matches(regex);
    }

    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*()?!/|\\%_\\-+,\\.~])[A-Za-z\\d@#$%^&*()?!/|\\%_\\-+,\\.~]{8,}$";
        return password.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!validateFullName(fullName)) {
            System.out.println("Invalid full name");
        }

        if (!validateEmail(email)) {
            System.out.println("Invalid email");
        }

        if (!validatePassword(password)) {
            System.out.println("Invalid password");
        }

        scanner.close();
    }
}