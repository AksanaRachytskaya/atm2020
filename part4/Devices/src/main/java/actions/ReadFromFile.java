package actions;

import model.Gadget;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFromFile implements Ireadable, Constants{

@Override
    public List<Gadget> read (){
        try (FileReader reader = new FileReader(PATH_TXT);
        BufferedReader bufferedReader = new BufferedReader(reader)){
    List <Gadget> gadgets = new ArrayList<>();
    String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 5) {
                    gadgets.add(new Gadget(fields[0], fields[1], Integer.parseInt(fields[2]),
                            Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                }
            }
            return gadgets;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return null;
}
}