import java.time.LocalDate;
import java.util.ArrayList;

public class TodoQuarter {
    ArrayList <TodoItem> todoItems;
    
    public TodoQuarter(){

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

    public ArrayList <TodoItem> getItems(){
        return todoItems; 
    }

    public String toString(){

        String formated = new String();
        return formated;
    }
}
