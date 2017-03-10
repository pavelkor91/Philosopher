package Philosophers;

class Log {

    public static void msg(String msg) {
        System.out.println(msg);
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
    }
}