import java.util.Scanner;
import java.util.regex.*;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Дата: ");

        if (scanner.hasNextLine()) {
            String date = scanner.nextLine();

            String pattern1 = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19[0-9]{2}|[2-9][0-9]{3})";
            Pattern p1 = Pattern.compile(pattern1);
            Matcher m1 = p1.matcher(date);

            String pattern2 = "(0[1-9]|[12][0-9]|3[01]).(0[1-9]|1[012]).(\\d{4})";
            Pattern p2 = Pattern.compile(pattern2);
            Matcher m2 = p2.matcher(date);

            if (m1.matches()) {
                System.out.print("Введенное выражение является датой");
            } else if (m2.matches()) {
                System.out.print("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            } else {
                System.out.print("Введенное выражение не является датой");
            }
        }


    }

}

