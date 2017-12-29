import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReaderImpMain implements IFileReader {

    private File file;
    private List<String> listOfLines;
    private Scanner in;

    FileReaderImpMain(File file) {
        this.file = file;
    }

    public List<String> readFile() throws FileNotFoundException {
        listOfLines = new ArrayList<>();
        in = new Scanner(file);
        while (in.hasNext()) {
            String line = in.nextLine();
            listOfLines.add(line);
        }
        return listOfLines;
    }
}
