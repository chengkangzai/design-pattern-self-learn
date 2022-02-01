package abuse;

public class StoppingState implements State {
    private Stopwatch stopwatch;

    public StoppingState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Stopwatch is running");
    }
}
