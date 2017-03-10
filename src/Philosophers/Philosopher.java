package Philosophers;

class Philosopher implements Runnable {

    private Fork leftFork;

    private Fork rightFork;

    private int id;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void eat() throws InterruptedException {
        if (!leftFork.used && !rightFork.used) {
            leftFork.take();
            rightFork.take();

            Log.msg(id + " : now eating");

            leftFork.putFork();
            rightFork.putFork();
        }
        Log.delay(1000);
        think();

    }



    public void think() throws InterruptedException{
        Log.msg(id + " : now thinking");
        Log.delay(1000);

    }

    @Override
    public void run() {
        while (true) {
            try {
                eat();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}