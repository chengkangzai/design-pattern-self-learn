package abuse;

/**
 * Before....
 */
//public class Stopwatch {
//    private boolean isRunning;
//
//    public void click() {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println("Stopwatch stopped");
//        } else {
//            isRunning = true;
//            System.out.println("Stopwatch started");
//        }
//    }
//}

/**
 * After...., but ... is it better? no, because stopwatch have a fixed state!
 * Understand your problem first, then think about the solution.
 * Since there is only 2 states, it is better to use a if else.
 */
public class Stopwatch {
    private State currentState = new StoppingState(this);

    public void click() {
        currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}