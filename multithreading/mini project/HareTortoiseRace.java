class AnimalThread extends Thread {

    private AnimalThread otherThread;

    public AnimalThread(String name) {
        super(name);
    }

    public void setOtherThread(AnimalThread otherThread) {
        this.otherThread = otherThread;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            // Stop if interrupted
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(getName() + " stopped.");
                return;
            }

            System.out.println(getName() + " : " + i + " meters");

            // Hare sleeps after 60 meters
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Hare interrupted.");
                    return;
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
                return;
            }

            // Winner
            if (i == 100) {
                System.out.println("\n************************");
                System.out.println(getName() + " WINS THE RACE!");
                System.out.println("************************");

                // Stop the other thread
                otherThread.interrupt();
                return;
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        AnimalThread hare = new AnimalThread("Hare");
        AnimalThread tortoise = new AnimalThread("Tortoise");

        // Each thread knows about the other
        hare.setOtherThread(tortoise);
        tortoise.setOtherThread(hare);

        // Hare has higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        // Start race
        hare.start();
        tortoise.start();
    }
}