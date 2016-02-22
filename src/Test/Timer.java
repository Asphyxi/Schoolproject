package Test;

import sample.Test;

/**
 * Created by Admin on 17-2-2016.
 */
public class Timer implements Runnable{

    double startTime;
    double currentTime;
    double deltaTime;

    public Timer() {
        startTime = System.currentTimeMillis();
        currentTime = startTime;
        deltaTime = 0;
    }

    @Override
    public void run() {
        while (true) {
            currentTime = System.currentTimeMillis(); // Zolang true (applicatie draait) current time = nu.

            deltaTime = currentTime - startTime;
            //Controller.updateTimer(deltaTime);

            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
