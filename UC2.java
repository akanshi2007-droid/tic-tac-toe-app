import java.util.Random;
public class UC2 {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        Random random = new Random();
        // 0 represents Human starts, 1 represents Computer starts
        int toss = random.nextInt(2); 

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';      // Traditionally, the starter is 'X'
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            computerSymbol = 'X';
            humanSymbol = 'O';
        }
    }
    static void displayTossResult() {
        System.out.println("--- Toss Result ---");
        if (isHumanTurn) {
            System.out.println("Result: Human won the toss!");
            System.out.println("Human starts first with symbol: " + humanSymbol);
            System.out.println("Computer will play as: " + computerSymbol);
        } else {
            System.out.println("Result: Computer won the toss!");
            System.out.println("Computer starts first with symbol: " + computerSymbol);
            System.out.println("Human will play as: " + humanSymbol);
        }
        System.out.println("-------------------");
    }
}
