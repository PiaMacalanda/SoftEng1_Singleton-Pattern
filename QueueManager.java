public class QueueManager {

    private static QueueManager instance;
    private int currentQueueNumber = 1;

    private QueueManager() {}


    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    // retrieves the next queue number and increments for the next customer
    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    // resets the queue number to a specified value
    public synchronized void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
        System.out.println("Queue reset to: " + newQueueNumber);
    }

    // risplays the current queue number (useful for online monitoring)
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }
}