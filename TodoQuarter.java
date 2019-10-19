import java.time.LocalDate;
import java.util.ArrayList;

public class TodoQuarter {
    ArrayList<TodoItem> todoItems = new ArrayList<>();
    
    public TodoQuarter() {
        // ArrayList <TodoItem> TodoQuarter;
    }

    public void addItem(String title, LocalDate deadline) {
        // TodoItem newitem = new TodoItem(title, deadline);
        // todoItems.add(newitem);
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).getDeadLine().isBefore(deadline)) {
                todoItems.add(i, new TodoItem(title, deadline));
                return;
            }
        }
        todoItems.add(new TodoItem(title, deadline));
    }

    public void removeItem(int index) {
        
    }

    public void archiveItems() {

    }

    public TodoItem getItem(int index) {
        return todoItems.get(index);
    }

    public ArrayList <TodoItem> getItems() {
        return todoItems; 
    }

    public String toString() {
        String formated = new String();
        return formated;
    }
}
