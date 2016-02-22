package Test;

/**
 * Created by Admin on 15-2-2016.
 */
public class Counter {
    /**
     * Static instance of it self, used to reference this counter.
     */
    private static Counter instance;

    /**
     * This method will return the instance of the counter.
     *
     * On first call instance will be null. A new instance will be created, which will be the only instance.
     * Every other call will just return this instance.
     *
     * @return Instance of the Counter class
     */
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    /**
     * The application can only have ONE counter.
     * This is achieved by making the constructor private.
     * The only way the methods in this class can be called is by using the {@link Counter#getInstance()}.
     */
    private Counter() {
        startOrReset();
    }

    /**
     * This integer contains the current countLabel of the counter.
     */
    private int count;
    private int time;

    /**
     * This method adds 1 to the current countLabel of {@link Counter#count}.
     */


    /**
     * This method will set {@link Counter#count} back to 0.
     */
    public void startOrReset() {
        count = 0;
    }


    /**
     * This method will return the current {@link Counter#count}.
     *
     * @return integer countLabel of {@link Counter#count}
     */
    public int getCount() {
        return count;
    }
}
