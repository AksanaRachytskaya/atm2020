package actions;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import model.Gadget;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadJson implements Ireadable, Constants {


    public ReadJson() {
    }

    @Override
    public List<Gadget> read() {
        ObjectMapper mapper = new ObjectMapper();

        do {

            try {
                return (List)mapper.readValue(new File(PATH_JSON),
                        new TypeReference<List<? extends Gadget>>() {
                        });
            }
            catch (MismatchedInputException a) {
                System.err.println(ERROR_MESSAGE_2);
                continue;
            } catch (JsonParseException e) {
                System.err.println(ERROR_MESSAGE_2);
                continue;
            } catch (JsonMappingException e) {
                System.err.println(ERROR_MESSAGE_2);
                continue;
            } catch (IOException e) {
                System.err.println(ERROR_MESSAGE_2);
                continue;
            }
        } while (false);
        return null;
    }
}











