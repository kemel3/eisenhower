import java.time.LocalDate;

public class TodoItem {
    String title;
    LocalDate deadline;
    boolean isDone = false;

    public TodoItem(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDeadLine() {
        return deadline;
    }

    public void mark() {
        isDone = true;
    }

    public void unmark() {
        isDone = false;
    }

    public String toString() {
        String abc = "";
        if (this.isDone == true) {
            abc += "[x] ";
        }
        else {
            abc += "[ ] ";
        }
        abc += this.deadline + " ";
        abc += this.title;
        return abc;
        
    }
}
