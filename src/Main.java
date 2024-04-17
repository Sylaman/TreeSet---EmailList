import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {

        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String[] inputArray = input.split(" ", 2);

            switch (inputArray[0]) {
                case "LIST":
                    if (inputArray.length != 1) {
                        System.out.println("Некорректный ввод!");
                    } else {
                        List<String> sortedEmailList = emailList.getSortedEmails();
                        for (String value : sortedEmailList) {
                            System.out.println(value);
                        }
                    }
                    break;
                case "ADD":
                    if (inputArray.length < 2) {
                        System.out.println(WRONG_EMAIL_ANSWER);
                    } else {
                        emailList.add(inputArray[1]);
                    }
                    break;
                default:
                    System.out.println("Неверная команда!");
            }
        }
    }
}

