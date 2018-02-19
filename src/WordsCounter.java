import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordsCounter {

    private String fileName;
    private int words_count;
    private String line;
    private String word;
    private Scanner scanner;

    public WordsCounter (String fileName){
        this.fileName = fileName;
        readFile();
    }

    // TODO: Complete the method below.
    public void readFile(){

        try {
            scanner = new Scanner(new FileReader(fileName));

        } catch (IOException e) {
            System.out.println("Error, file not found.");
            System.out.println(e);
        }

        while (scanner.hasNext()){
            line = scanner.next();
            String [] wordsArray = new String [line.length()];
            for (int i = 0; i<line.length(); i++){
            }
        }

        scanner.close();
    }


    public void countWords(){

    }
}
