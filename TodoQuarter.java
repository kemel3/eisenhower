import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoQuarter {
    ArrayList<TodoItem> todoItems;

    TodoQuarter(){

    }

    public void addItem(String title, LocalDate deadline){

    }

    public void removeItem(int index){

    }

    public void archiveItems(){

    }
    public TodoItem getItem(int index){


        return todoItems.get(index);
    }

    private ArrayList<TodoItem> getItems(){


        return todoItems; 
    }

    public String toString(){

        String formated = new String();


        return formated;

    }
}
