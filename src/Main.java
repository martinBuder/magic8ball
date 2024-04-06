import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Anzahl Möglichkeiten
        int amount = getAnswerAmount();
        String[] Answers = readAnswers(amount);

        // Antworten einlesen

        // frage einlesen

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
}