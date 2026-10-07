import stanford.karel.*;

public class MyKarel2ExtendedCopilotAgentCreation extends Karel {

    public void run() {
        collectBeepersAlongRow();
        returnToStart();
        unloadBeepers();
    }

    private void collectBeepersAlongRow() {
        collectCurrentSquare();

        while (frontIsClear()) {
            move();
            collectCurrentSquare();
        }
    }

    private void collectCurrentSquare() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }

    private void returnToStart() {
        turnAround();

        while (frontIsClear()) {
            move();
        }

        turnAround();
    }

    private void unloadBeepers() {
        while (beepersInBag()) {
            putBeeper();
        }
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }
}
