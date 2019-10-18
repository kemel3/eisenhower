import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoQuarter {
    ArrayList<TodoItem> todoItems = new ArrayList<TodoItem>();
    
    public TodoQuarter() {
        // ArrayList <TodoItem> TodoQuarter;
    }

    public void addItem(String title, LocalDate deadline) {
        TodoItem td = new TodoItem(title, deadline);
        todoItems.add(td);
        //Comparator <TodoItem> c = Collections.reverseOrder();
        // todoItems.sort(c);
        int arrLen = todoItems.size();
        LocalDate localDate = LocalDate.now();
        //LocalDate pom = todoItems.get(1).deadline;
        ArrayList<TodoItem> pom = new ArrayList<TodoItem>();
        LocalDate neareDate = todoItems.get(0).deadline;
        for (int i = 0; i < arrLen; i++){
            
            

        }
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
