package Philosophers;

/**
 * Created by Ленизка on 10.03.2017.
 */
public class TestDinner {

    private static final int NUM_PHILOSOPHS = 5;

    public static void main(String[] args) {


        Fork[] forks = new Fork[NUM_PHILOSOPHS];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHS];

        philosophers[0] = new Philosopher(1, forks[0], forks[1]);
        philosophers[1] = new Philosopher(2, forks[1], forks[2]);
        philosophers[2] = new Philosopher(3, forks[2], forks[3]);
        philosophers[3] = new Philosopher(4, forks[3], forks[4]);
        philosophers[4] = new Philosopher(5, forks[0], forks[4]);

        for (int i = 0; i < philosophers.length; i++) {
            Log.msg("Threаd " + i + " Started");
            Thread t = new Thread(philosophers[i]);
            t.start();
        }
    }
}

