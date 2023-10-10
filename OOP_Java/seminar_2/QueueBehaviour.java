package OOP_Java.seminar_2;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
