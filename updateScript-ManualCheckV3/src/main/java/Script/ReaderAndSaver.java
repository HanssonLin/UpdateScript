package Script;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderAndSaver {
    //construct it so can be used publicly
    public ReaderAndSaver() {
    }

    /*
    -reads the given file fouund at the file location
    -and saves each line into a index position in a String[]
    -then returns said String[]
    */
    public String[] readAndReturnArray(String fileLocation) {

        ClassLoader classLoader = getClass().getClassLoader();
        //If there is not file there, you will get null
        File fileList;
        try {
            fileList = new File(classLoader.getResource(fileLocation).getFile());
        } catch (Exception e) {
            return(null);
        }
        //makes arraylist of strings
        ArrayList<String> List = new ArrayList<String>();

        //saves each line of the .txt file into the arraylist
        try{
            Scanner fileScanner = new Scanner(fileList);
            while (fileScanner.hasNextLine()) {
                String URL = fileScanner.nextLine();
                List.add(URL);
            }
            fileScanner.close();

        } catch( IOException e) {
            e.printStackTrace();
        }
        //converts arraylist to string[]
        String[] Array = new String[List.size()];
        Array = List.toArray(Array);

        return(Array);
    }
}
