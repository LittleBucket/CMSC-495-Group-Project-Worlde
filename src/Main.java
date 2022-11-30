import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public String green1= " ";
    public String green2= "b";
    public String green3= " ";
    public String green4= " ";
    public String green5= " ";
    String greenCombo = "";

    public String yellow1= "";
    public String yellow2= "";
    public String yellow3= "";
    public String yellow4= "";
    public String yellow5= "";
    public String yellowCombo = "";

    public String red1= "";
    public String red2= "";
    public String red3= "";
    public String red4= "";
    public String red5= "";
    public String redCombo = "";



    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        WordleLogic wordleLogic = new WordleLogic();
        ArrayHolder arrayHolder = new ArrayHolder();

        Scanner input = new Scanner(System.in);

        arrayHolder.ScanIn();
        wordleLogic.wordleLogic();


        System.out.println(ArrayHolder.wordle);
    }
}
