public class QueueManager {
    private static QueueManager instance;
    private int currentQueueNumber = 1;

    private QueueManager() {}

    // Singleton instance getter
    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    // Retrieves the next queue number and increments for the next customer
    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    // Resets the queue number to a specified value
    public synchronized void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
        System.out.println("Queue reset to: " + newQueueNumber);
    }

    // Displays the current queue number (useful for online monitoring)
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }
}