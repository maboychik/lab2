import java.util.Scanner;
import java.util.regex.*;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пароль: ");

        if (scanner.hasNextLine()) {
            String pass = scanner.nextLine();

            String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(pass);

            if (m.matches()) {
                System.out.print("Пароль ненадежен. Повторите ввод");
            } else {
                System.out.print("Пароль надежен");
            }
        }


    }

}
