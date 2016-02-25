package sample;

/**
 * Created by Admin on 22-2-2016.
 */
public class Doekoez {

    private static Doekoez instance;

    public static Doekoez getInstance() {
        if (instance == null){
            instance = new Doekoez();
        }
        return instance;
    }

    private Doekoez() {
        money = 0;
        tickSize = 1;
    }

    private int money;

    public int getTickSize() {
        return tickSize;
    }

    public synchronized void setTickSize(int tickSize) {
        this.tickSize = tickSize;
    }

    private int tickSize;

    public void tick() {money += tickSize;}

    public int getDoekoe() {return money;}

    public void setDoekoe(int money) {
//        if(this.money - money <= 0) {
//            throw new IllegalStateException("MONEY HAS REACHED AN UNREACHABLE STATE YOU FUCKING DUMB ASS!");
//        }

        this.money = money;
    }

}
