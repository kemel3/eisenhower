import java.io.BufferedReader;
import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;

public class TodoMatrix {
    
    private Map <String, TodoQuarter> todoQuarters = new HashMap <String, TodoQuarter>();
    
    public TodoMatrix() {
        todoQuarters.put("IU", new TodoQuarter());
        todoQuarters.put("IN", new TodoQuarter());
        todoQuarters.put("NU", new TodoQuarter());
        todoQuarters.put("NN", new TodoQuarter());
    }

    public Map <String, TodoQuarter> getQuarters() {
        return todoQuarters;
    }

    public TodoQuarter getQuarter(String status) {
        return todoQuarters.get(status);
    }

    public void addItem(String title, LocalDate deadline, boolean isImportant) {
        
    }

    public void addItemsFromFile(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] variables = line.split("|");
            String title = variables[0];
            LocalDate deadline = LocalDate.parse(variables[1]);
            boolean isImportant = false;
            if (variables[2] != "") {
                isImportant = true;
            }
            addItem(title, deadline, isImportant);
        }
    }
}
