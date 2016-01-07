package chapter7;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.Random;

/**
 * Created by kkrol on 07/01/2016.
 */
public class Main1 {

    private static final Random RANDOM = new Random();
    private static final EventBus EVENT_BUS = new EventBus();
    private static final EventSubscriber EVENT_SUBSCRIBER = new EventSubscriber();

    static {
        EVENT_BUS.register(EVENT_SUBSCRIBER);
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            Event event = getEvent();
            EVENT_BUS.post(event);
            Thread.sleep(1000);
        }

    }

    private static Event getEvent() {
        double randomDouble = RANDOM.nextDouble();
        String eventName = Long.toString(System.currentTimeMillis());
        if (randomDouble < 0.33) {
            return new FirstEvent(eventName);
        } else if (randomDouble < 0.66) {
            return new SecondEvent(eventName);
        }
        return new ThirdEvent(eventName);
    }

    private static class EventSubscriber {

        @Subscribe
        public void onFirstEvent(FirstEvent event) {
            System.out.println("FirstEvent = " + event.getName());
        }

        @Subscribe
        public void onSecondEvent(SecondEvent event) {
            System.out.println("SecondEvent = " + event.getName());
        }

        @Subscribe
        public void onDeadEvent(DeadEvent deadEvent) {
            System.out.println("DeadEvent = " + deadEvent);
        }
    }

}
