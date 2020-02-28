package supermarket;

import java.util.Random;


public class Customer {
    private int id;
    private int items;
    private int chosenCashier;
    private boolean willChange;
    private boolean willAbandon;
    private int numChanges = 0;
    private boolean hasArrived = false;
    private boolean hasDeparted = false;
    private boolean hasQueued = false;
    private int timeArrived = 0;
    private int timeQueued = 0;
    private int timeDeparted = 0;

    Customer() {
        id = 0;
        items = 0;
        willChange = false;

    }

    Customer(int id, int items) {
        this.id = id;
        this.items = items;

    }

    // GETTERS AND SETTERS //

    public int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    public int getItems() {
        return this.items;
    }

    void setItems(int items) {
        this.items = items;
    }

    public int getChosenCashier() {
        return chosenCashier;
    }

    public void setChosenCashier(int chosenCashier) {
        this.chosenCashier = chosenCashier;
    }

    public int getNumChanges() {
        return numChanges;
    }

    public void setNumChanges(int numChanges) {
        this.numChanges = numChanges;
    }

    int getShoppingTime() { return (items / 2) + 1;
    }



    //returns true if customer has arrived to store
    public boolean hasArrived() {
        return hasArrived;
    }

    public void setHasArrived(int i) {
        this.hasArrived = true;
        this.timeArrived = i;
    }

    public int getArrivedTime() {
        return this.timeArrived;
    }

    //returns true if customer has finished shopping and has queued for checkout
    public boolean hasQueued() {
        return hasQueued;
    }

    public void setHasQueued(int i) {
        this.hasQueued = true;
        this.timeQueued = i;
    }

    public int getQueuedTime() {
        return this.timeQueued;
    }

    //returns true if customer has departed from the store
    public boolean hasDeparted() {
        return hasDeparted;
    }

    public void setHasDeparted(int i) {
        this.hasDeparted = true;
        this.timeDeparted = i;
    }

    public int getDepartedTime() {
        return this.timeDeparted;
    }

    public boolean willAbandon() {
        return willAbandon;
    }

    public void setWillAbandon(boolean willAbandon) {
        this.willAbandon = willAbandon;
    }

}
