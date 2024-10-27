public class Main {

    public static void main(String[] args) {

        HelpDeskStation station1 = new HelpDeskStation("Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Station 3");

        // serving customers
        station1.serveNextCustomer();
        station2.serveNextCustomer();
        station3.serveNextCustomer();

        // display current queue number for monitoring
        System.out.println("Current queue number: " + QueueManager.getInstance().getCurrentQueueNumber());

        // deset the queue for a special situation
        QueueManager.getInstance().resetQueueNumber(100);

        // derve more customers after resetting
        station1.serveNextCustomer();
        station2.serveNextCustomer();
    }
}