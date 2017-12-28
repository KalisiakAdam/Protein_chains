import java.io.FileNotFoundException;
import java.util.List;


public interface IFileReader {
    List<String> readFile() throws FileNotFoundException;
}
