import java.time.LocalDate;

public class TodoItem {
    String title;
    LocalDate deadline;
    boolean isDone;

    TodoItem(String title, LocalDate deadline){
        this.deadline = deadline;
        this.title = title;
        
    }

    public String getTitle(){
        return title;

    }

    public LocalDate getDeadLine(){
        return deadline;
    }

    public void mark(){
        this.isDone = true;


    }

    public void unmark(){
        this.isDone = false;
    }
}
