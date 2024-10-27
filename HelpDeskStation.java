public class HelpDeskStation {
    private final String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer() {
        int queueNumber = QueueManager.getInstance().getNextQueueNumber();
        System.out.println(stationName + " serving customer with queue number: " + queueNumber);
    }
}