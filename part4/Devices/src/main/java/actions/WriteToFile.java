package actions;

import model.Gadget;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WriteToFile implements Iwritable{
@Override
    public void write(List<Gadget> gadgets){
        try (FileWriter writer = new FileWriter("D:\\learn_it\\W-automation\\pre-selection tasks\\java\\projects\\src\\main\\java\\resources\\out.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            for (Gadget gadget : gadgets) {
                bufferedWriter.write (gadget.getName() + "; " + gadget.getZone() + "; " + gadget.getUsesAweek() + "; " + gadget.getPower() + "; " + gadget.getWorkingTime());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
