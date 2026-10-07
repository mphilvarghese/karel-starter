import stanford.karel.*;

public class MyKarelExtendedCopilotAgentCreation extends Karel {

    public void run() {
        moveToBeeper();
        pickBeeper();
        returnToStart();
    }

    private void moveToBeeper() {
        move();
        move();
        turnLeft();
        move();
    }

    private void returnToStart() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
}
