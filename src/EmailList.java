import java.util.*;

public class EmailList {

    Set<String> emailListSet = new TreeSet<>();
    String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";


    public void add(String email) {
        if (!email.matches(emailRegex)) {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        } else if (emailListSet.contains(email.toLowerCase())) {
            System.out.println("Данный email уже был добавлен ранее");
        } else {
            emailListSet.add(email.toLowerCase());
            System.out.println("Email успешно добавлен");
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailListSet);
    }
}