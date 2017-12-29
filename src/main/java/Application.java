
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Application {

    private List<String> listOfChains;

    private String sortedArray(String input){
        char[] arrayOfChars = input.toCharArray();
        Arrays.sort(arrayOfChars);
        return new String(arrayOfChars);
    }


    private boolean changePossible(String s1, String s2){

        int position = 0;
        while(position < s2.length()-1){
            if (s1.length() == s2.length() && sortedArray(s1).charAt(position) == sortedArray(s2).charAt(position)){
                position+=1;
            }else {
                return false;
            }
        }
        return true;
    }

    private boolean[] numbersOfPairs() {
        boolean[] pair = new boolean[listOfChains.size() / 2];
        int pairPosition = 0;
        for(int i = 0; i < listOfChains.size(); i+=2){
          pair[pairPosition] =  changePossible(listOfChains.get(i),listOfChains.get(i+1));
          pairPosition++;
        }
        return pair;

    }

    public static void main(String[] args) throws FileNotFoundException {

        long startTime = System.currentTimeMillis();

        Application application = new Application();
        IFileReader fileReading = new FileReaderImpArgs(args);
        application.listOfChains = fileReading.readFile();

        boolean[] result = application.numbersOfPairs();

        long stopTime = System.currentTimeMillis();
        long totalTime = stopTime - startTime;
        System.out.println("Total time to make calculations is " + totalTime + " milliseconds");

        for (boolean x : result){
            System.out.print(x + ", ");
        }
    }
}
