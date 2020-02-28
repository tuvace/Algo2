package supermarket;


public class Main {

    public static void main(String[] args) {
        SuperMarket market = new SuperMarket(0,10,3,0);
        market.addEventToQueue(new Event(0, type.CUSTOMER_CHANGE_LINE,1));
        market.addEventToQueue(new Event(0, type.CUSTOMER_READY_CHECKOUT,1));
        market.addEventToQueue(new Event(0, type.CUSTOMER_FINISH_CHECKOUT,1));
        market.addEventToQueue(new Event(0, type.CUSTOMER_ABANDON,1));
        while(market.getEventQueue().peek() != null){
            market.step();
            printEventQueue(market);

        }

    }

    private static void printEventQueue(SuperMarket s){
        for(int i = 0; i < s.getEventQueue().size(); i++){
            System.out.print(s.getEventQueue().poll().getEventType() + ", ");
        }
        System.out.println("");
    }
}