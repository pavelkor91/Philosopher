package Philosophers;

class Fork {

    public boolean used;
    private int id;

    public Fork(int id) {
        this.id = id;
    }

    public synchronized void take() {
        Log.msg("take " + id+" from table");
        this.used = true;
    }

    public synchronized void putFork() {
        Log.msg("put fork" + id + " on table");
        this.used = false;
    }
}