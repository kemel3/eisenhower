import java.io.BufferedReader;
import java.io.File;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;

public class TodoMatrix {
    

    Map <String, TodoQuarter> todoQuarters = new Map<String,TodoQuarter>();

    //todoQuarters.put();



    private String getQuarters() {
        return todoQuarters;
    }

    public String getQuarter(String status) {


        return todoQuarters.get(status);
    }

    public String addItem(String title, LocalDate deadline, boolean isImportant) {
        
       // todoQuarters.addItem()

    }

    public void addItemsFromFile(String fileName){

        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){
            String[] variables = line.split("|");
            String title = variables[0];
            LocalDate deadline = LocalDate.parse(variables[1]);
            boolean isImportant = variables[2];

            addItem(title, deadline, isImportant);


        }




    }





}
