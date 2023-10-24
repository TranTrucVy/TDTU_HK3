public class MainQueue {
    public static void main(String[] args) throws Exception {

        QueueBasedStacks queueBasedStacks = new QueueBasedStacks(5);
        queueBasedStacks.enqueue(1);
        queueBasedStacks.enqueue(2);
        queueBasedStacks.enqueue(3);
        queueBasedStacks.enqueue(4);
    
        System.out.println(queueBasedStacks.deQueue());
        

    }
}
