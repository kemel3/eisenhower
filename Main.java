import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2018-08-01");
        TodoItem test = new TodoItem("invent1", date1);

        System.out.println(test.title);
        System.out.println(test.deadline);

        System.out.println(test.isDone);
        test.mark();
        System.out.println(test.isDone);
        test.unmark();
        System.out.println(test.isDone);
    }
}
