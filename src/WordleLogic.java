public class WordleLogic {


    char currentLetter;
    char wordLetter;

    public void wordleLogic() {
        Main main = new Main();

        main.greenCombo = main.green1 + main.green2 + main.green3 + main.green4 + main.green5;
        main.yellowCombo = main.yellow1 + main.yellow2 + main.yellow3 + main.yellow4 + main.yellow5;
        main.redCombo = main.red1 + main.red2 + main.red3 + main.red4 + main.red5;


        //Red word Iteration
        for (int w = 0; w < ArrayHolder.wordle.size(); w++) {//iterate for Arraylist

            //Red word Iteration
            for (int i = 0; i < main.redCombo.length(); i++) {//iterate for the red words listed
                currentLetter = main.redCombo.charAt(i);
                ArrayHolder.wordle.removeIf(e -> e.contains(String.valueOf(currentLetter)));
            }


            //Yellow word Iteration
            for (int i = 0; i < main.yellowCombo.length(); i++) {//for loop to iterate all the yellow words listed
                currentLetter = main.yellowCombo.charAt(i);
                ArrayHolder.wordle.removeIf(e -> !e.contains(String.valueOf(currentLetter)));
            }
        }
        //Green word Iteration
        for (int w = 0; 0 < ArrayHolder.wordle.size() -1; w++) {
            for (int i = 0; i < main.greenCombo.length(); i++) {//for loop to iterate all the green words listed
                currentLetter = main.greenCombo.charAt(i);
                wordLetter = ArrayHolder.wordle.get(w).charAt(i);
                System.out.println(ArrayHolder.wordle.get(w));
                if (wordLetter == currentLetter) {
                   ArrayHolder.wordle.remove(w);
                } else {


                }

            }

        }
    }
}