import java.util.ArrayList;
import java.util.List;

public class App { // первый пуки каки в мастер

    private final List<String> log = new ArrayList<>();

    public void add(String message) {
        log.add(message);
    }

    public void printAll() {
        for (int i = 0; i < log.size(); i++) { // первый пуки как в свою ветку
            System.out.println((i + 1) + ") " + log.get(i));
        }
    }

    public static void main(String[] args) { // второй пуки как в свою ветку
        App app = new App();
        app.add("First message"); // второй пуки как в мастер
        app.add("Second message");
        app.add("Third message");
        app.printAll();
    }
}