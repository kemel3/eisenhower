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
        // for (int i = 0; i < todoItems.size(); i++) {
        //     if (todoItems.get(i).getDeadLine().isBefore(deadline)) {
        //         todoItems.add(i, new TodoItem(title, deadline));
        //     }
        // }
        todoItems.add(new TodoItem(title, deadline));
        TodoItem newItem = new TodoItem(title, deadline);
        todoItems.add(newItem);
        todoItems.sort(new DeadLine());
    }

    public void removeItem(int index) {
        todoItems.remove(index);
    }

    public void archiveItems() {
        int arrayLength = todoItems.size();
        for(int index = 0; index < arrayLength; index++) {
            TodoItem item = todoItems.get(index);
            if(item.isDone()) {
                todoItems.remove(item);
                arrayLength--;
            }
        }
    }

    public TodoItem getItem(int index) {
        TodoItem object = todoItems.get(index);
        return object;
    }

    public ArrayList <TodoItem> getItems() {
        return todoItems; // error
    }

    public String toString() {
        String outputString = "";
        String row = "";
        for (int index = 1; index <= todoItems.size(); index++) {
            row = todoItems.get(index-1).toString();
            outputString += String.format("%d. %s\n", index, row);
        }
        return outputString;
    }
}
