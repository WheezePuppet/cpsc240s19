
public class Cheerleader implements Runnable {
    
    private String team;
    private int delay;

    Cheerleader(String t, int d) {
        team = t;
        delay = d;
    }

    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Go " + team + "!!");
            try {
                Thread.currentThread().sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {

        Cheerleader c1 = new Cheerleader("Steelers", 300);
        Cheerleader c2 = new Cheerleader("Bruins", 80);
        Cheerleader c3 = new Cheerleader("Golden Knights", 5);
        Cheerleader c4 = new Cheerleader("Devils", 50);
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        
        t4.start();
        t1.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
