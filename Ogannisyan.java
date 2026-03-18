import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public abstract class MyTimer {
    // коммит в мастер
    private List<TimerListener> listeners = new ArrayList<>();
    protected Timer executor = new Timer();

    public void addListener(TimerListener listener) {
        listeners.add(listener);
    }
    // второй коммит в мастер
    protected void notifyListeners() {
        for (TimerListener l : listeners) {
            l.onTimerElapsed();
        }
    }

    public abstract void schedule(int delay);

    public void stop() {
        executor.cancel();
    }
}

