import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayHolder {

    public static ArrayList<String> wordle = new ArrayList<>();

    public void ScanIn() throws FileNotFoundException {

        Scanner s = new Scanner(new File("WordleList.txt"));
        while (s.hasNext()){
            wordle.add(s.next());
        }
        s.close();

    }


    public void arrays(){

    }


}
