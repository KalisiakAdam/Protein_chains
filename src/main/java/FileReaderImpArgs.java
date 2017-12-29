
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderImpArgs implements IFileReader {

    private String[] args;

    FileReaderImpArgs(String[] args) {
        this.args = args;
    }

    public List<String> readFile() throws FileNotFoundException {
        List<String> listOfLines = new ArrayList<>();
        if(args.length < 1) {
            System.out.println("No java ClassName inputfile");
            System.exit(1);
        }
        Scanner in = new Scanner(new FileInputStream(args[0]));
        while (in.hasNext()) {
            String line = in.nextLine();
            listOfLines.add(line);
        }
        return listOfLines;
    }
}
