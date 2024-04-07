import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Anzahl Möglichkeiten
        int amount = getAnswerAmount();
        // Antworten einlesen
        String[] Answers = readAnswers(amount);
        // frage einlesen
        askMe(Answers);
        // Zufällige Antwort wählen

        // neue frage oder abbrechen

    }

    public static int getAnswerAmount() {
        boolean isIntNumber = false;
        int answerAmountNumber = 0;
        while(!isIntNumber) {
            String answerAmount = JOptionPane.showInputDialog("Wie viele Antwortmöglichkeiten soll es geben?");
            isIntNumber = true;
            try {
                answerAmountNumber = Integer.parseInt(answerAmount);
                if( answerAmountNumber <= 0) isIntNumber = false;
            }
            catch(Exception exception) {
                isIntNumber = false;
            }
        }
        return answerAmountNumber;
    }

    public static String[] readAnswers(int amount) {
        String[] answersArray = new String[amount];
        for (int i = 0; i < amount; i++) {
            answersArray[i] = JOptionPane.showInputDialog("Gebe eine Antwortmöglichkeit ein.");
        }
        return answersArray;
    }

    public static int getRandomNumber(int maxNr) {
        int minNr = 0;
        return (int) (Math.random() * (maxNr - minNr + 1) + minNr);
    }

    public static void askMe(String[] answers) {
        boolean isEnd = false;
        String readInput = JOptionPane.showInputDialog("Stelle eine Frage.");
        while (!isEnd) {
            if(readInput.isEmpty()) readInput = "Du hast keine Frage gestellt. Möchtest du eine Frage stellen?";
            else readInput = JOptionPane.showInputDialog("Die Antwort lautet: " +  answers[getRandomNumber(answers.length)] + "  Stelle noch eine Frage oder klicke auf Abrechen.");
            if(readInput == null) isEnd = true;
        }
    }


}