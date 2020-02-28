package supermarket;

enum type {
    CUSTOMER_ARRIVES, CUSTOMER_READY_CHECKOUT, CUSTOMER_FINISH_CHECKOUT,
    CUSTOMER_CHANGE_LINE, CUSTOMER_ABANDON
}

/**
 * class representing a discrete event
 * contains info on the event type, related customer's ID, and the event start time
 * used in supermarket class' event handler
 */
public class Event {
    private type eventType;
    private int startTime;
    private int customerID;

    public Event(int customerID, type eventType, int startTime) {
        this.customerID = customerID;
        this.eventType = eventType;
        this.startTime = startTime;
    }

    //getters
    int getStartTime() {
        return startTime;
    }

    int getCustomerID() {
        return customerID;
    }

    type getEventType() {
        return eventType;
    }

}